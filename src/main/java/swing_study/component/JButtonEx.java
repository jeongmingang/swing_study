package swing_study.component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JToggleButton;

@SuppressWarnings("serial")
public class JButtonEx extends JFrame implements ActionListener {
	private String imgPath = System.getProperty("user.dir") + File.separator + "imgPath" + File.separator;
	
	private JPanel contentPane;
	private MyButton btn01;
	private JToggleButton tglbtn;

	public JButtonEx() {
		initialize();
	}
	private void initialize() {
		setTitle("JButto & JToggleButten 예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 681, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JPanel pLeft = new JPanel();
		contentPane.add(pLeft);
		pLeft.setLayout(new BoxLayout(pLeft, BoxLayout.Y_AXIS));
		
		btn01 = new MyButton();
		btn01.setText("call~~");
		pLeft.add(btn01);
		
		tglbtn = new JToggleButton("토글 버튼");
		tglbtn.addActionListener(this);
		pLeft.add(tglbtn);
		
		JPanel pRight = new JPanel();
		contentPane.add(pRight);
		pRight.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel pTop = new JPanel();
		pTop.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "수평 정렬", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pRight.add(pTop);
		pTop.setLayout(new GridLayout(0, 1, 0, 0));
		
		MyButton btn02 = new MyButton();
		btn02.setHorizontalAlignment(SwingConstants.LEFT);
		btn02.setText("LEFT");
		pTop.add(btn02);
		
		MyButton btn03 = new MyButton();
		btn03.setText("CENTER");
		pTop.add(btn03);
		
		MyButton btn04 = new MyButton();
		btn04.setHorizontalAlignment(SwingConstants.RIGHT);
		btn04.setText("RIGHT");
		pTop.add(btn04);
		
		JPanel pButton = new JPanel();
		pButton.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "수직 정렬", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pRight.add(pButton);
		pButton.setLayout(new GridLayout(0, 3, 0, 0));
		
		MyButton btn05 = new MyButton();
		btn05.setText("TOP");
		btn05.setVerticalAlignment(SwingConstants.TOP);
		pButton.add(btn05);
		
		MyButton btn06 = new MyButton();
		btn06.setText("CENTER");
		pButton.add(btn06);
		
		MyButton btn07 = new MyButton();
		btn07.setText("BOTTOM");
		btn07.setVerticalAlignment(SwingConstants.BOTTOM);
		pButton.add(btn07);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == tglbtn) {
			actionPerformedTglbtn(e);
		}
		if (e.getSource() == btn01) {
			actionPerformedBtn01(e);
		}
	}
	protected void actionPerformedBtn01(ActionEvent e) {
	}
	protected void actionPerformedTglbtn(ActionEvent e) {
		if(tglbtn.isSelected()) {
			tglbtn.setText("눌렸네");
		}else {
			tglbtn.setText("눌려봐");
		}
	}
}
