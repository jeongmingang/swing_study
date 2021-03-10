package swing_study.component.table;

import javax.swing.SwingConstants;

import swing_study.panel.Studentgrade;

@SuppressWarnings("serial")
public class StdgradeTablePanel extends AbstractCustomTablePanel<Studentgrade> {

	@Override
	protected void setAlignAndWidth() {
		//컬럼 내용 정렬
		setTableCellAlign(SwingConstants.CENTER, 0, 1, 2);
		setTableCellAlign(SwingConstants.RIGHT, 3, 4, 5, 6, 7);
								
		//컬럼별 너비 조정
		setTableCellWidth(100, 250, 100, 100, 100, 100, 100, 100);
	}

	@Override
	public Object[] toArray(Studentgrade t) {
		return new Object[] {
				t.getStdNo(),
				t.getStdName(),
				t.getBan(),
				t.getKor(),
				t.getEng(),
				t.getMath(),
				t.getSoc(),
				t.getSci()
		};
	}

	@Override
	public String[] getColumnNames() {
		return new String[] {"학번", "학생이름", "분반", "국어", "영어", "수학", "사회", "과학"};
	}

}
