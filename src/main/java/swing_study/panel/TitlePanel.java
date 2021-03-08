package swing_study.panel;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class TitlePanel extends JPanel {
	private JTextField tfTNo;
	private JTextField tfTName;

	public TitlePanel() {

		initialize();
	}
	private void initialize() {
		setBorder(new TitledBorder(null, "직책 정보", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new GridLayout(0, 2, 10, 10));
		
		JLabel lblTNo = new JLabel("직책번호");
		lblTNo.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblTNo);
		
		tfTNo = new JTextField();
		add(tfTNo);
		tfTNo.setColumns(10);
		
		JLabel lblTname = new JLabel("직책명");
		lblTname.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblTname);
		
		tfTName = new JTextField();
		tfTName.setColumns(10);
		add(tfTName);
	}
	
	public void setTitle(Title title) {
		tfTNo.setText(String.valueOf(title.gettNo()));
		tfTName.setText(title.gettName());
	}
	
	public Title getTitle() {
		int TNo = Integer.parseInt(tfTNo.getText().trim());
		String TName = tfTName.getText().trim();
		return new Title(TNo, TName);
	}

	public void clearTf() {
		tfTNo.setText("");
		tfTName.setText("");
	}
	
}
