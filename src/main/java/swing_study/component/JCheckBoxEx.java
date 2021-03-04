package swing_study.component;

import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;

@SuppressWarnings("serial")
public class JCheckBoxEx extends JFrame implements ItemListener {

	private JPanel contentPane;
	private JCheckBox chckbxApple;
	private JLabel lblRes;
	private int sum;
	private String resStr = "현재 0원 입니다.";
	private JCheckBox chckbxPear;
	private JCheckBox chckbxCherry;

	public JCheckBoxEx() {
		initialize();
		chckbxCherry.setSelected(true);
	}
	
	private void initialize() {
		setTitle("체크박스 예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 321, 139);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel pNorth = new JPanel();
		pNorth.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.add(pNorth, BorderLayout.NORTH);
		pNorth.setLayout(new BoxLayout(pNorth, BoxLayout.Y_AXIS));
		
		JLabel lblTitle = new JLabel("사과 100원, 배 500원, 체리 2000원");
		lblTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
		pNorth.add(lblTitle);
		
		JPanel pSouth = new JPanel();
		contentPane.add(pSouth, BorderLayout.SOUTH);
		
		lblRes = new JLabel(resStr);
		pSouth.add(lblRes);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		chckbxApple = new JCheckBox("사과");
		chckbxApple.addItemListener(this);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel.add(chckbxApple);
		
		chckbxPear = new JCheckBox("배");
		chckbxPear.addItemListener(this);
		panel.add(chckbxPear);
		
		chckbxCherry = new JCheckBox("체리");
		chckbxCherry.addItemListener(this);
		panel.add(chckbxCherry);
	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == chckbxCherry) {
			itemStateChangedChckbxCherry(e);
		}
		if (e.getSource() == chckbxPear) {
			itemStateChangedChckbxPear(e);
		}
		if (e.getSource() == chckbxApple) {
			itemStateChangedChckbxApple(e);
		}
		resStr = String.format("현재 %d원 입니다.", sum);
		lblRes.setText(resStr);
	}
	protected void itemStateChangedChckbxApple(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			sum += 100;
		}else {
			sum -= 100;
		}
	}
	protected void itemStateChangedChckbxPear(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			sum += 500;
		}else {
			sum -= 500;
		}
	}
	protected void itemStateChangedChckbxCherry(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			sum += 2000;
		}else {
			sum -= 2000;
		}
	}
}
