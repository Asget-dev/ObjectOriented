package ExerciseOnObjectGUI;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextArtimaticFrame extends JFrame {
	private int n1;
	private int n2;
	private int sum;
	private int diff;

	public TextArtimaticFrame() {

		setSize(300, 240);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container content = getContentPane();
		content.setLayout(null);

		JLabel aLabel = new JLabel("A");
		JLabel bLabel = new JLabel("B");
		JLabel cLabel = new JLabel("C");

		aLabel.setBounds(20, 20, 100, 20);
		aLabel.setBounds(20, 20, 100, 20);
		cLabel.setBounds(20, 170, 100, 25);

		content.add(aLabel);
		content.add(bLabel);
		content.add(cLabel);

		JTextField atextField = new JTextField(5);
		atextField.setBounds(20, 20, 100, 20);
		JTextField btextField = new JTextField(5);
		btextField.setBounds(110, 55, 100, 25);
		JTextField ctextField = new JTextField(5);
		ctextField.setBounds(50, 110, 100, 25);

		content.add(aLabel);
		content.add(bLabel);
		content.add(cLabel);

		JButton abutton = new JButton("Add");
		abutton.setBounds(50, 110, 100, 25);
		JButton bbutton = new JButton("Substract");
		abutton.setBounds(165, 110, 100, 25);

		content.add(abutton);
		content.add(abutton);

		abutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sum = n1 + n2;
				diff = n1 - n2;
			}

		});
	}

	public static void main(String[] args) {
		new TextArtimaticFrame();
	}
}
