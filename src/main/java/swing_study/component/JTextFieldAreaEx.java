package swing_study.component;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Font;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.demo.DateChooserPanel;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class JTextFieldAreaEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField tfName;
	private JPasswordField pfPass1;
	private JPasswordField pfPass2;
	private JTextArea ta;
	private JLabel lblConfirm;
	private JDateChooser dateChooser;
	private JButton btnAdd;
	private JButton btnCancel;

	public JTextFieldAreaEx() {
		initialize();
	}

	private void initialize() {
		setTitle("텍스트 필드");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel pCenter = new JPanel();
		contentPane.add(pCenter, BorderLayout.CENTER);
		pCenter.setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane = new JScrollPane();
		pCenter.add(scrollPane, BorderLayout.CENTER);

		ta = new JTextArea();
		ta.setEditable(false);
		scrollPane.setViewportView(ta);

		JPanel pNorth = new JPanel();
		pNorth.setPreferredSize(new Dimension(250, 250));
		pNorth.setBorder(new EmptyBorder(10, 20, 10, 20));
		contentPane.add(pNorth, BorderLayout.NORTH);
		pNorth.setLayout(new GridLayout(0, 2, 10, 10));

		JLabel lblName = new JLabel("성명");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		pNorth.add(lblName);

		tfName = new JTextField();
		pNorth.add(tfName);
		tfName.setColumns(10);

		JLabel lblPass1 = new JLabel("비밀번호");
		lblPass1.setHorizontalAlignment(SwingConstants.RIGHT);
		pNorth.add(lblPass1);

		pfPass1 = new JPasswordField();
		pNorth.add(pfPass1);

		JLabel lblPass2 = new JLabel("비밀번호 확인");
		lblPass2.setHorizontalAlignment(SwingConstants.RIGHT);
		pNorth.add(lblPass2);

		pfPass2 = new JPasswordField();
		pfPass2.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void removeUpdate(DocumentEvent e) {
				getMessage();
			}

			@Override
			public void insertUpdate(DocumentEvent e) {
				getMessage();
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				getMessage();
			}

			private void getMessage() {
				String pw1 = new String(pfPass1.getPassword());
				String pw2 = String.valueOf(pfPass2.getPassword());
				if (pw1.equals(pw2)) {
					lblConfirm.setText("일치");
				} else {
					lblConfirm.setText("불일치");
				}
			}
		});
		pNorth.add(pfPass2);

		JPanel panel = new JPanel();
		pNorth.add(panel);

		lblConfirm = new JLabel("");
		lblConfirm.setFont(new Font("굴림", Font.BOLD, 12));
		lblConfirm.setHorizontalAlignment(SwingConstants.CENTER);
		lblConfirm.setForeground(Color.RED);
		pNorth.add(lblConfirm);

		JLabel lblBirth = new JLabel("생년월일");
		lblBirth.setHorizontalAlignment(SwingConstants.RIGHT);
		pNorth.add(lblBirth);

		dateChooser = new JDateChooser(new Date());
		dateChooser.setDateFormatString("yyyy. MM. dd");
		pNorth.add(dateChooser);

		btnAdd = new JButton("추가");
		btnAdd.addActionListener(this);
		pNorth.add(btnAdd);

		btnCancel = new JButton("취소");
		btnCancel.addActionListener(this);
		pNorth.add(btnCancel);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancel) {
			actionPerformedBtnCancel(e);
		}
		if (e.getSource() == btnAdd) {
			actionPerformedBtnAdd(e);
		}
	}

	protected void actionPerformedBtnAdd(ActionEvent e) {
		if (lblConfirm.getText().equals("일치")) {
			Date d = dateChooser.getDate();
			String msg = String.format("%s - %tF%n", tfName.getText(), d);
			ta.append(msg);
			clearTf();
			JOptionPane.showMessageDialog(null, "추가되었습니다.");
		} else {
			pfPass2.setText("");
			pfPass1.requestFocus();
			pfPass1.selectAll();
		}

	}

	public void clearTf() {
		tfName.setText("");
		pfPass1.setText("");
		pfPass2.setText("");
		dateChooser.setDate(new Date());
		lblConfirm.setText("");
		tfName.requestFocus();
	}

	protected void actionPerformedBtnCancel(ActionEvent e) {
		clearTf();
	}
	
}
