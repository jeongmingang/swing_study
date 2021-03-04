package swing_study;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import swing_study.component.FrameComponentEx;
import swing_study.component.Fruit;
import swing_study.component.JButtonEx;
import swing_study.component.JCheckBoxCustomEx;
import swing_study.component.JCheckBoxEx;
import swing_study.component.JLabelEx;
import swing_study.component.JRadioButtonEX;
import swing_study.component.JTextFieldAreaEx;
import swing_study.frame.ContentPaneEx;
import swing_study.frame.JpanelEx;
import swing_study.layout.FrameLayout;
import swing_study.layout.LayoutGuBun;
import swing_study.layout.PanelFlow;

import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.UIManager;
import java.awt.Color;

public class SwingMain extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btn01;
	private JButton btn02;
	private JPanel pLayout;
	private JButton btnFlowLayout;
	private JButton btnBorderLayout;
	private JButton btnGridLayout;
	private JButton btnAbsoluteLayout;
	private JButton btn03;
	private JPanel pComponent1;
	private JButton btn04;
	private JButton btn05;
	private JPanel pCheckRadio;
	private JButton btn06;
	private JButton btn07;
	private JPanel pText;
	private JButton btn08;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingMain frame = new SwingMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SwingMain() {
		initialize();
	}
	private void initialize() {
		setTitle("스윙 스터디");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(10, 10, 700, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 10, 10));
		
		btn01 = new JButton("Jframe 예");
		btn01.addActionListener(this);
		contentPane.add(btn01);
		
		btn02 = new JButton("JPanel 예");
		btn02.addActionListener(this);
		contentPane.add(btn02);
		
		pLayout = new JPanel();
		pLayout.setBorder(new TitledBorder(null, "레이아웃", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pLayout);
		pLayout.setLayout(new GridLayout(0, 1, 0, 10));
		
		btnFlowLayout = new JButton("플로우 레이아웃");
		btnFlowLayout.addActionListener(this);
//		btnFlowLayout.addActionListener(e -> new FrameLayout(LayoutGuBun.FLOW));
		
		pLayout.add(btnFlowLayout);
		
		btnBorderLayout = new JButton("보더 레이아웃");
		btnBorderLayout.addActionListener(this);
		pLayout.add(btnBorderLayout);
		
		btnGridLayout = new JButton("그리드 레이아웃");
		btnGridLayout.addActionListener(this);
		pLayout.add(btnGridLayout);
		
		btnAbsoluteLayout = new JButton("절대 레이아웃");
		btnAbsoluteLayout.addActionListener(this);
		pLayout.add(btnAbsoluteLayout);
		
		btn03 = new JButton("JComponent 공통 속성");
		btn03.addActionListener(this);
		contentPane.add(btn03);
		
		pComponent1 = new JPanel();
		pComponent1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "JLabel & JButton & JtoggleButton", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(pComponent1);
		pComponent1.setLayout(new GridLayout(0, 1, 0, 0));
		
		btn04 = new JButton("JLabel");
		btn04.addActionListener(this);
		pComponent1.add(btn04);
		
		btn05 = new JButton("JButton & JToggleButton");
		btn05.addActionListener(this);
		pComponent1.add(btn05);
		
		pCheckRadio = new JPanel();
		pCheckRadio.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "JCheckBox & JRadioButton", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(pCheckRadio);
		
		btn06 = new JButton("JCheckBox");
		btn06.addActionListener(this);
		pCheckRadio.setLayout(new GridLayout(2, 2, 0, 0));
		pCheckRadio.add(btn06);
		
		btn07 = new JButton("JRadioBox");
		btn07.addActionListener(this);
		pCheckRadio.add(btn07);
		
		pText = new JPanel();
		pText.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\uD14D\uC2A4\uD2B8\uD544\uB4DC", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(pText);
		
		btn08 = new JButton("JTextField 관련예제");
		btn08.addActionListener(this);
		pText.add(btn08);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn08) {
			actionPerformedBtn08(e);
		}
		if (e.getSource() == btn07) {
			actionPerformedBtn07(e);
		}
		if (e.getSource() == btn06) {
			actionPerformedBtn06(e);
		}
		if (e.getSource() == btn05) {
			actionPerformedBtn2(e);
		}
		if (e.getSource() == btn04) {
			actionPerformedBtn1(e);
		}
		if (e.getSource() == btn03) {
			actionPerformedBtn03(e);
		}
		if (e.getSource() == btnAbsoluteLayout) {
			actionPerformedBtnAbsoluteLayout(e);
		}
		if (e.getSource() == btnGridLayout) {
			actionPerformedBtnGridLayout(e);
		}
		if (e.getSource() == btnBorderLayout) {
			actionPerformedBtnBorderLayout(e);
		}
		if (e.getSource() == btnFlowLayout) {
			actionPerformedBtnFlowLayout(e);
		}
		if (e.getSource() == btn02) {
			actionPerformedBtn02(e);
		}
		if (e.getSource() == btn01) {
			actionPerformedBtn01(e);
		}
	}
	protected void actionPerformedBtn01(ActionEvent e) {
		ContentPaneEx frame = new ContentPaneEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn02(ActionEvent e) {
		JpanelEx frame = new JpanelEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtnFlowLayout(ActionEvent e) {
		FrameLayout frame = new FrameLayout(LayoutGuBun.FLOW);
		frame.setVisible(true);
	}
	protected void actionPerformedBtnBorderLayout(ActionEvent e) {
		FrameLayout frame = new FrameLayout(LayoutGuBun.BORDER);
		frame.setVisible(true);
	}
	protected void actionPerformedBtnGridLayout(ActionEvent e) {
		FrameLayout frame = new FrameLayout(LayoutGuBun.GRID);
		frame.setVisible(true);
	}
	protected void actionPerformedBtnAbsoluteLayout(ActionEvent e) {
		FrameLayout frame = new FrameLayout(LayoutGuBun.ABSOLUTE);
		frame.setVisible(true);
	}
	protected void actionPerformedBtn03(ActionEvent e) {
		FrameComponentEx frame = new FrameComponentEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn1(ActionEvent e) {
		JLabelEx frame = new JLabelEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn2(ActionEvent e) {
		JButtonEx frame = new JButtonEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn06(ActionEvent e) {
		JCheckBoxEx frame = new JCheckBoxEx();
		frame.setVisible(true);
		
		ArrayList<Fruit> list = new ArrayList<Fruit>();
		list.add(new Fruit("사과", 100));
		list.add(new Fruit("배", 500));
		list.add(new Fruit("체리", 2000));
		list.add(new Fruit("바나나", 1000));
		
		JCheckBoxCustomEx frame1 = new JCheckBoxCustomEx(list);
		frame1.setVisible(true);
	}
	protected void actionPerformedBtn07(ActionEvent e) {
		JRadioButtonEX frame = new JRadioButtonEX();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn08(ActionEvent e) {
		JTextFieldAreaEx frame = new JTextFieldAreaEx();
		frame.setVisible(true);
	}
}
