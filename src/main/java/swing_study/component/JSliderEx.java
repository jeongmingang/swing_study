package swing_study.component;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JSlider;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Font;

@SuppressWarnings("serial")
public class JSliderEx extends JFrame implements ChangeListener {
	
	private JPanel contentPane;
	private JSlider sliderBlue;
	private JSlider sliderGreen;
	private JSlider sliderRed;
	private JLabel lblColor;

	public JSliderEx() {
		setTitle("JSlider 예제");
		initialize();
		sliderRed.addChangeListener(this);
		sliderGreen.addChangeListener(this);
		sliderBlue.addChangeListener(this);
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 492, 317);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pCenter = new JPanel();
		pCenter.setBorder(new EmptyBorder(0, 10, 0, 10));
		contentPane.add(pCenter, BorderLayout.CENTER);
		pCenter.setLayout(new GridLayout(0, 1, 0, 0));
		
		sliderRed = new JSlider();	
		sliderRed.setForeground(Color.RED);
		sliderRed.setMaximum(255);
		sliderRed.setMajorTickSpacing(50);
		sliderRed.setMinorTickSpacing(10);
		sliderRed.setPaintTicks(true);
		sliderRed.setPaintLabels(true);
		sliderRed.setValue(128);
		pCenter.add(sliderRed);
		
		sliderGreen = new JSlider();
		sliderGreen.setPaintTicks(true);
		sliderGreen.setPaintLabels(true);
		sliderGreen.setMinorTickSpacing(10);
		sliderGreen.setMaximum(255);
		sliderGreen.setMajorTickSpacing(50);
		sliderGreen.setForeground(Color.GREEN);
		sliderGreen.setValue(128);
		pCenter.add(sliderGreen);
		
		sliderBlue = new JSlider();		
		sliderBlue.setPaintTicks(true);
		sliderBlue.setPaintLabels(true);
		sliderBlue.setMinorTickSpacing(10);
		sliderBlue.setMaximum(255);
		sliderBlue.setMajorTickSpacing(50);
		sliderBlue.setForeground(Color.BLUE);
		sliderBlue.setValue(128);
		pCenter.add(sliderBlue);
		
		JPanel pSouth = new JPanel();
		contentPane.add(pSouth, BorderLayout.SOUTH);
		
		lblColor = new JLabel("New label");
		lblColor.setFont(new Font("굴림", Font.BOLD, 25));
		lblColor.setForeground(Color.LIGHT_GRAY);
		lblColor.setOpaque(true);
		pSouth.add(lblColor);
	}

	public void stateChanged(ChangeEvent e) {
		
		int red = sliderRed.getValue();
		int green = sliderGreen.getValue();
		int blue = sliderBlue.getValue();
		
		
		String message = String.format("Red(%d) Green(%d) Blue(%d)", red, green, blue);
		lblColor.setText(message);
		lblColor.setBackground(new Color(red, green, blue));
	}
}
