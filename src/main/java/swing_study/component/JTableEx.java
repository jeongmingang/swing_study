package swing_study.component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import swing_study.component.table.DeptTablePanel;
import swing_study.component.table.EmpTablePanel;
import swing_study.component.table.MyCustomTable2Panel;
import swing_study.component.table.MyTablePanel;
import swing_study.component.table.Student;
import swing_study.component.table.Studentgrade2;
import swing_study.component.table.TitleTablePanel;
import swing_study.panel.Department;
import swing_study.panel.Employee;
import swing_study.panel.Title;

@SuppressWarnings("serial")
public class JTableEx extends JFrame {

	private JPanel contentPane;
	private JTable table1;

	private List<Student> stdList = new ArrayList<>();
	private List<Department> deptList = new ArrayList<>();
	private List<Title> TitleList = new ArrayList<>();
	private List<Employee> EmpList = new ArrayList<>();
//	private List<Studentgrade> StdgradeList = new ArrayList<>();
	private List<Studentgrade2> stgList = new ArrayList<>();
	
	public JTableEx() {
		stdList.add(new Student(1, "김인환", 50, 60, 60));
		stdList.add(new Student(2, "이태훈", 70, 97, 70));
		stdList.add(new Student(3, "김상건", 90, 92, 100));
		stdList.add(new Student(4, "전수린", 60, 63, 67));
		
		deptList.add(new Department(1, "개발", 8));
		deptList.add(new Department(2, "인사", 8));
		deptList.add(new Department(3, "총무", 8));
		
		TitleList.add(new Title(1, "사장"));
		TitleList.add(new Title(2, "부장"));
		TitleList.add(new Title(3, "과장"));
		TitleList.add(new Title(4, "대리"));
		
		//int empNo, String empName, Title title, Employee manager, int salary, Department dept
		EmpList.add(new Employee(1, "김상건", TitleList.get(0), null, 4000000, deptList.get(0)));
		EmpList.add(new Employee(2, "이성래", TitleList.get(1), new Employee(1, "김상건"), 2000000, deptList.get(1)));
		EmpList.add(new Employee(3, "이태훈", TitleList.get(2), new Employee(1, "김상건"), 2000000, deptList.get(1)));
		
//		///////////// 프로젝트 dto참고
//		//int stdNo, String stdName, String ban, int kor, int eng, int math, int soc, int sci
//		StdgradeList.add(new Studentgrade(20001, "박재선", "A01", 72, 73, 90, 72, 84));
//		StdgradeList.add(new Studentgrade(20002, "한동성", "A01", 83, 72, 83, 90, 91));
	
		stgList.add(new Studentgrade2(20001, "박재선", "A01", 72, 73, 90, 72, 84));
		stgList.add(new Studentgrade2(20002, "한동성", "A01", 76, 43, 34, 33, 62));
		stgList.add(new Studentgrade2(20003, "정정일", "A01", 88, 72, 92, 88, 99));
		stgList.add(new Studentgrade2(20004, "정명훈", "A01", 40, 69, 55, 50, 45));
		stgList.add(new Studentgrade2(20005, "임정만", "A01", 78, 95, 79, 79, 97));
		stgList.add(new Studentgrade2(20006, "임성준", "A01", 77, 95, 87, 81, 85));
		stgList.add(new Studentgrade2(20016, "박운승", "A02", 45, 33, 22, 47, 65));
		stgList.add(new Studentgrade2(20017, "김윤재", "A02", 77,	83,	70,	98,	88));
		stgList.add(new Studentgrade2(20018, "황보동명", "A02", 81, 90, 74, 73, 73));
		stgList.add(new Studentgrade2(20019, "사대호", "A02", 71,	83,	79,	99,	83));
		stgList.add(new Studentgrade2(20020, "박동수", "A02", 86,	98,	92,	81,	73));
		stgList.add(new Studentgrade2(20021, "안추환", "A02", 98,	97,	93,	90,	71));
		stgList.add(new Studentgrade2(20031, "정민강", "A03", 95, 95, 100, 95, 82));
		initialize();
	}

	private void initialize() {
		setTitle("JTable 예");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 894, 511);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 10, 10));

		JPanel pTable1 = new JPanel();
		pTable1.setBorder(new TitledBorder(null, "기본 테이블 생성", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pTable1);
		pTable1.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane1 = new JScrollPane();
		pTable1.add(scrollPane1, BorderLayout.CENTER);
		
		table1 = new JTable();
		table1.setModel(getModel());
		scrollPane1.setViewportView(table1);

		JPanel pTable2 = new JPanel();
		contentPane.add(pTable2);
		pTable2.setLayout(new BorderLayout(0, 0));
		
		///////////////////////////////// list 추가
		MyTablePanel pCustomTable2 = new MyTablePanel();
		pCustomTable2.setList(stdList);
		pCustomTable2.setBorder(new TitledBorder(null, "CustomTable", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pTable2.add(pCustomTable2, BorderLayout.CENTER);

		JPanel pTable3 = new JPanel();
		contentPane.add(pTable3);
		pTable3.setLayout(new BorderLayout(0, 0));
		
		DeptTablePanel pDeptTable3 = new DeptTablePanel();
		// deptlist 추가
		pDeptTable3.setList(deptList);
		
		pDeptTable3.setBackground(Color.WHITE);
		pTable3.add(pDeptTable3, BorderLayout.CENTER);

		JPanel pTable4 = new JPanel();
		contentPane.add(pTable4);
		pTable4.setLayout(new BorderLayout(0, 0));
		
		TitleTablePanel pTitleTable4 = new TitleTablePanel();
		// TitleList 추가
		pTitleTable4.setList(TitleList);
		
		pTable4.add(pTitleTable4, BorderLayout.CENTER);
		
		JPanel pTable5 = new JPanel();
		contentPane.add(pTable5);
		pTable5.setLayout(new BorderLayout(0, 0));
		
		EmpTablePanel pEmpTable5 = new EmpTablePanel();
		// EmpList 추가
		pEmpTable5.setList(EmpList);
		pTable5.add(pEmpTable5, BorderLayout.CENTER);
		
		JPanel pTable6 = new JPanel();
		contentPane.add(pTable6);
		pTable6.setLayout(new BorderLayout(0, 0));
		
//		////////////// 프로젝트 dto참고
		MyCustomTable2Panel pCustomTable6 = new MyCustomTable2Panel();
		//stgList 추가
		pCustomTable6.setList(stgList);
		pTable6.add(pCustomTable6, BorderLayout.CENTER);
		
//		////////////// 프로젝트 dto참고
//		StdgradeTablePanel pStdgradeTable6 = new StdgradeTablePanel();
//		//StdgradeList 추가
//		pStdgradeTable6.setList(StdgradeList);
//		pTable6.add(pStdgradeTable6, BorderLayout.CENTER);
	}

	public DefaultTableModel getModel() {
		CustomTableModel model = new CustomTableModel(getData(), getColumnNames());
		return model;
	}

	class CustomTableModel extends DefaultTableModel{
		public CustomTableModel(Object[][] data, Object[] columnNames) {
			super(data, columnNames);
		}
		
		@Override
		public boolean isCellEditable(int row, int column) {
			return false;
		}
	}
	public Object[][] getData() {
		return new Object[][] {
			{1, "박유진", 10, "여자"},
			{2, "이태훈", 11, "남자"},
		};
	}

	public String[] getColumnNames() {
		return new String[] {"학생번호", "학생명", "나이", "성별"};
	}

}
