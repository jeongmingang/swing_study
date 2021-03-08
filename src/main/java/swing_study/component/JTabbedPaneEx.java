package swing_study.component;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;

import swing_study.panel.Department;
import swing_study.panel.DeptPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import swing_study.panel.TitlePanel;
import swing_study.panel.EmployeePanel;

@SuppressWarnings("serial")
public class JTabbedPaneEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnComfirm;
	private JTabbedPane tabbedPane;

	public JTabbedPaneEx() {
		initialize();
	}
	private void initialize() {
		setTitle("JTabbedPane 예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 505, 717);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		DeptPanel pDept = new DeptPanel();
		tabbedPane.addTab("부서", null, pDept, "부서");
		
		TitlePanel pTitle = new TitlePanel();
		tabbedPane.addTab("직책", null, pTitle, "직책");
		
		EmployeePanel pEmp = new EmployeePanel();
		tabbedPane.addTab("사원", null, pEmp, "사원");
		
		JPanel pBtn = new JPanel();
		contentPane.add(pBtn, BorderLayout.SOUTH);
		
		btnComfirm = new JButton("확인");
		btnComfirm.addActionListener(this);
		pBtn.add(btnComfirm);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnComfirm) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
	//선택된 탭가져와서
	Component comp = tabbedPane.getSelectedComponent();
	
	System.out.println(comp);
	//getXX()
	DeptPanel deptPanel = (DeptPanel) comp;
	Department department = deptPanel.getDepartment();
	
	JOptionPane.showMessageDialog(null, department);
		
	}
}
