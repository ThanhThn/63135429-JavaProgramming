import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.Window;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class WindowForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setTitle("Hello World");
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setSize(400, 600);
		f.setLayout(new FlowLayout());
		//Create Button
		JButton btn1 = new JButton("Click Me");
		JButton btn2 = new JButton("Click Here");
		
		f.add(btn2);
		f.add(btn1);
		f.show();
	}

}
