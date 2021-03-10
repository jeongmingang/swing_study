package swing_study.layout;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class PanelFlow extends JPanel {

	public PanelFlow() {

		initialize();
	}
	private void initialize() {
		setLayout(new GridLayout(3, 1, 0, 0));
		
		JPanel p1 = new JPanel();
		p1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "align(leading)", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		add(p1);
		p1.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JButton btnNewButton = new JButton("1");
		p1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		p1.add(btnNewButton_1);
		
		JPanel p2 = new JPanel();
		p2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "align(center)", TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
		add(p2);
		
		JButton btnNewButton_2 = new JButton("1");
		p2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("2");
		p2.add(btnNewButton_3);
		
		JPanel p3 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) p3.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		p3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "align(trailing)", TitledBorder.RIGHT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		add(p3);
		
		JButton btnNewButton_4 = new JButton("1");
		p3.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("2");
		p3.add(btnNewButton_5);
	}

}
