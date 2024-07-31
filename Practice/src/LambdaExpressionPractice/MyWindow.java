package LambdaExpressionPractice;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyWindow {

	public static void main(String[] args) 
	{
		 // Window : Object JFrame
		
		JFrame frame = new JFrame("My Window");
		frame.setSize(400,400);
		frame.setLayout(new FlowLayout());
		
		// create button & add jframe
		JButton button = new JButton("click me!!");
		
		// with anonymous class
//		button.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//			System.out.println("Button clicked");
//				JOptionPane.showMessageDialog(null, "hey button is clicked");
//			}
//		});
		
		// with lambda expression
		button.addActionListener( e -> {
			System.err.println("Button click");
			JOptionPane.showMessageDialog(null, "Hey , button is clicked");
		});
		
		
		frame.add(button);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
