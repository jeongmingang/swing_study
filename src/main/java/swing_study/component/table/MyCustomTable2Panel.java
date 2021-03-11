package swing_study.component.table;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.RowSorter;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

@SuppressWarnings("serial")
public class MyCustomTable2Panel extends JPanel {
	private JTable table;
	
	public MyCustomTable2Panel() {

		initialize();
	}
	private void initialize() {
		setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setModel(getModel());
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(table);
	}
	public DefaultTableModel getModel() {
		return new DefaultTableModel(getData(),getColumnNames());
	}
	
	public Object[][] getData() {
		Object[][] datas = new Object[1][10];	//1행 10열
		datas[0] = new Object[][] {null, null, null, null, null, null, null, null, null, null};
		return datas;
	}
	
	public String[] getColumnNames() {
		return new String[] {
				"학번", "학생이름", "분반", "국어", "영어", "수학", "사회", "과학", "총점", "평균"};
	}
	
	public void setList(List<Studentgrade2> stgList) {
		Object[][] datas = new Object[stgList.size()][];
		for(int i=0; i<datas.length; i++) {
			datas[i] = toArray(stgList.get(i));
		}
	
		CustomTableModel model = new CustomTableModel(datas, getColumnNames());
		table.setModel(model);
		
		RowSorter<TableModel> sorter = new TableRowSorter<TableModel>(model);
		table.setRowSorter(sorter);
		
		//컬럼 내용 정렬
		setTableCellAlign(SwingConstants.CENTER, 0, 1, 2);
		setTableCellAlign(SwingConstants.RIGHT, 3, 4, 5, 6, 7, 8, 9);
		
		//컬럼별 너비 조정
		setTableCellWidth(100, 150, 80, 80, 80, 80, 80, 80, 80);
		
		//조건에 맞는 색조절(총점 200점 레즈)
		setTableCellCondition(0,1,2,3,4,5,6,7,8,9);
	}
	
	private void setTableCellCondition(int...idx) {
		ConditionTableCellRenderer ctcr = new ConditionTableCellRenderer();
		TableColumnModel tcm = table.getColumnModel();
		for(int i=0; i<idx.length; i++) {
			tcm.getColumn(i).setCellRenderer(ctcr);
		}
	}
	private void setTableCellWidth(int...width) {
		TableColumnModel tcm = table.getColumnModel();
		
		for(int i=0; i<width.length; i++) {
			tcm.getColumn(i).setPreferredWidth(width[i]);
		}
	}
	
	private void setTableCellAlign(int align, int...idx) {
		TableColumnModel tcm = table.getColumnModel();
		
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(align);
		
		for(int i=0; i<idx.length; i++) {
			tcm.getColumn(idx[i]).setCellRenderer(dtcr);
		}
	}
	
	private Object[] toArray(Studentgrade2 stdgrade2) {
		Object[] datas = new Object[] {
				stdgrade2.getStdNo(),
				stdgrade2.getStdName(),
				stdgrade2.getBan(),
				stdgrade2.getKor(),
				stdgrade2.getEng(),
				stdgrade2.getMath(),
				stdgrade2.getSoc(),
				stdgrade2.getSci(),
				stdgrade2.getTotal(),
				String.format("%.1f", stdgrade2.getAvg())};
		return datas;
	}
	
	private class CustomTableModel extends DefaultTableModel {
		public CustomTableModel(Object[][] datas, Object[] columnNames) {
			super(datas, columnNames);
		}
		
		@Override
		public boolean isCellEditable(int row, int column) {
			return false;
		}
	}
	
	private class ConditionTableCellRenderer extends JLabel implements TableCellRenderer {

		@Override
		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
				int row, int column) {
			setText(value == null?"":value.toString());
			setOpaque(true);
			int total = (int) table.getValueAt(row, 8);
			if(total < 300) {
				setBackground(Color.RED);
			}else if (total > 450) {
				setBackground(Color.CYAN);
			}else {
				setBackground(Color.WHITE);
			}
			
			switch(column) {
			case 0: case 1: case 2:
				setHorizontalAlignment(SwingConstants.CENTER);
				break;
			default :
				setHorizontalAlignment(SwingConstants.RIGHT);
	}
			return this;
		}
		
	}
	
}
