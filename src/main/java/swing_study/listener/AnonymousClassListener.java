package swing_study.listener;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class AnonymousClassListener extends JFrame {

	private JPanel contentPane;

	public AnonymousClassListener() {
		initialize();
	}

	private void initialize() {
		setTitle("익명클래스 예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0)); // jframe은 기본적으로 보더 레이아웃
		setContentPane(contentPane);

		JButton btn = new JButton("Action");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(e);
				JButton btn = (JButton) e.getSource(); // Object이므로 타입캐스트해줘야 함
				if (e.getActionCommand().equals("Action")) {
					btn.setText("액션");
				} else {
					btn.setText("Action");
				}
			}
		});
		
		contentPane.add(btn, BorderLayout.CENTER);

	}

}
