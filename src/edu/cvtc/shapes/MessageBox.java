package edu.cvtc.shapes;



import javax.swing.JOptionPane;

/**
 * @author gcedarblade
 *
 */
public class MessageBox implements Dialog{

	@Override
	public int show(String message, String title) {
		JOptionPane.showMessageDialog(null, title, message, JOptionPane.OK_OPTION);
		return JOptionPane.OK_OPTION;
	}
	
}
