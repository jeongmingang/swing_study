package swing_study.panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import com.toedter.calendar.JDateChooser;

@SuppressWarnings("serial")
public class EmployeePanel extends JPanel {
	private JTextField tfEmpNo;
	private JTextField tfEmpName;
	private JComboBox cmbTitle;
	private JComboBox cmbManager;
	private JSpinner spinSalary;
	private JComboBox cmbDept;
	private JDateChooser dateHire;
	private JPasswordField pfPass1;
	private JTextField tfPass2;

	public EmployeePanel() {

		initialize();
	}

	private void initialize() {
		setBorder(new TitledBorder(null, "사원 정보", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new BorderLayout(0, 0));

		JPanel pItem = new JPanel();
		add(pItem);
		pItem.setLayout(new GridLayout(0, 2, 10, 0));

		JLabel lblEmpNo = new JLabel("사원번호");
		lblEmpNo.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblEmpNo);

		tfEmpNo = new JTextField();
		tfEmpNo.setColumns(10);
		pItem.add(tfEmpNo);

		JLabel lblEmpName = new JLabel("사원명");
		lblEmpName.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblEmpName);

		tfEmpName = new JTextField();
		tfEmpName.setColumns(10);
		pItem.add(tfEmpName);

		JLabel lblTitle = new JLabel("직책");
		lblTitle.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblTitle);

		cmbTitle = new JComboBox();
		pItem.add(cmbTitle);

		JLabel lblManager = new JLabel("직속상사");
		lblManager.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblManager);

		cmbManager = new JComboBox();
		pItem.add(cmbManager);

		JLabel lblSalary = new JLabel("월급");
		lblSalary.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblSalary);

		spinSalary = new JSpinner();
		pItem.add(spinSalary);

		JLabel lblDept = new JLabel("부서");
		lblDept.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblDept);

		cmbDept = new JComboBox();
		pItem.add(cmbDept);

		JLabel lblHireDate = new JLabel("입사일");
		lblHireDate.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblHireDate);

		dateHire = new JDateChooser();
		pItem.add(dateHire);

		JLabel lblPass1 = new JLabel("비밀번호");
		lblPass1.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblPass1);

		pfPass1 = new JPasswordField();
		pItem.add(pfPass1);

		JLabel lblPass2 = new JLabel("비밀번호 확인");
		lblPass2.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblPass2);

		tfPass2 = new JTextField();
		pItem.add(tfPass2);
		tfPass2.setColumns(10);

		JPanel spacePanel = new JPanel();
		pItem.add(spacePanel);

		JPanel lblResultPanel = new JPanel();
		pItem.add(lblResultPanel);
		lblResultPanel.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblResult = new JLabel("New label");
		lblResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblResult.setFont(new Font("굴림", Font.BOLD, 20));
		lblResult.setForeground(Color.RED);
		lblResultPanel.add(lblResult);

		JPanel pTop = new JPanel();
		add(pTop, BorderLayout.NORTH);
		pTop.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JPanel pPic = new JPanel();
		pTop.add(pPic);
		pPic.setLayout(new BorderLayout(0, 0));

		JLabel lblPIc = new JLabel("");
		lblPIc.setHorizontalAlignment(SwingConstants.CENTER);
		lblPIc.setIcon(new ImageIcon("C:\\workspace_java\\swing_study\\images\\태연1.jpg"));
		lblPIc.setPreferredSize(new Dimension(150, 170));
		pPic.add(lblPIc, BorderLayout.CENTER);

		JPanel pBtnPic = new JPanel();
		pPic.add(pBtnPic, BorderLayout.SOUTH);

		JButton btnAddPic = new JButton("사진 추가");
		pBtnPic.add(btnAddPic);
	}

	public void setEmployee(Employee employee) {

	}

	public Employee getEmployee() {
		return null;
	}

	public void clearTf() {

	}

}