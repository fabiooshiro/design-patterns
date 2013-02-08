package command;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	
	private static final long serialVersionUID = -6057174514009118031L;

	private JackSparrow jackSparrow;
	
	public MainFrame(){
		this.setLayout(new BorderLayout());
		jackSparrow = new JackSparrow();
		jackSparrow.setBounds(0, 0, 800, 600);
		this.setBounds(0, 0, 800, 600);
		this.add(jackSparrow, BorderLayout.CENTER);
		this.setVisible(true);
		new Plan(jackSparrow).play();
	}
	
	public static void main(String[] args) {
		new MainFrame();
	}

}
