package swing_study.layout;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class PanelBorder extends JPanel {

	public PanelBorder() {

		initialize();
	}
	private void initialize() {
		setLayout(new BorderLayout(10, 10));
		
		JLabel lblNorth = new JLabel("North");
		lblNorth.setHorizontalAlignment(SwingConstants.CENTER);
		lblNorth.setFont(new Font("굴림", Font.BOLD, 20));
		lblNorth.setOpaque(true); //jlabel은 투명 -> 불투명
		lblNorth.setBackground(Color.ORANGE);
		add(lblNorth, BorderLayout.NORTH);
		
		JLabel lblCenter = new JLabel("Center");
		lblCenter.setHorizontalAlignment(SwingConstants.CENTER);
		lblCenter.setFont(new Font("굴림", Font.BOLD, 20));
		lblCenter.setBackground(Color.GREEN);
		lblCenter.setOpaque(true);
		add(lblCenter, BorderLayout.CENTER);
		
		JLabel lblWest = new JLabel("West");
		lblWest.setHorizontalAlignment(SwingConstants.CENTER);
		lblWest.setFont(new Font("굴림", Font.BOLD, 20));
		lblWest.setBackground(Color.MAGENTA);
		lblWest.setOpaque(true);
		add(lblWest, BorderLayout.WEST);
		
		JLabel lblEast = new JLabel("East");
		lblEast.setHorizontalAlignment(SwingConstants.CENTER);
		lblEast.setFont(new Font("굴림", Font.BOLD, 20));
		lblEast.setBackground(Color.CYAN);
		lblEast.setOpaque(true);
		add(lblEast, BorderLayout.EAST);
		
		JLabel lblSouth = new JLabel("South");
		lblSouth.setHorizontalAlignment(SwingConstants.CENTER);
		lblSouth.setFont(new Font("굴림", Font.BOLD, 20));
		lblSouth.setBackground(Color.LIGHT_GRAY);
		lblSouth.setOpaque(true);
		add(lblSouth, BorderLayout.SOUTH);
	}

}
