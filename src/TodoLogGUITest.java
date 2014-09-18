import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class TodoLogGUITest extends JPanel implements ActionListener {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame("TodoLogGUI");
				frame.setBounds(100, 100, 450, 300);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				frame.add(new TodoLogGUITest());
				
				frame.pack();
				frame.setVisible(true);	
			}
		});
	}

	/**
	 * Create the application.
	 */
	private JTextField textField;
	private JTextArea textArea;
	public TodoLogGUITest() {
		super(new GridBagLayout());
 
        textField = new JTextField(20);
        textField.addActionListener(this);
 
        textArea = new JTextArea(5, 20);
        textArea.setEditable(true);
        JScrollPane scrollPane = new JScrollPane(textArea);
        
        //Add Components to this panel.
        GridBagConstraints c = new GridBagConstraints();
        c.gridwidth = GridBagConstraints.REMAINDER;
 
        c.fill = GridBagConstraints.HORIZONTAL;
        add(textField, c);
 
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty = 1.0;
        add(scrollPane, c);
    }
	
	public void actionPerformed(ActionEvent evt) {
	    String text = textField.getText();
	    textArea.append(text + '\n');
	    textField.selectAll();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	public static void main() {
		
	}

}
