
//Redwan Alzain
// This is the code for a simple GUI interface I created while experimenting using Java's swing class components
// The interface deosn't neccasierly perform any tasks, but can be used as a template
// For a more sophisticated application

package com.java24hours;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author redwanalzain
 */
public class MainFrame extends JFrame{

    /**
     * @param args the command line arguments
     */
    
    
    public MainFrame(){
    //Gives the Frame a Title
     super("Test Frame");
     
     //Creating a layout manager object (Simplest layout manager is used, which is the FlowLayout Manager)
     FlowLayout f = new FlowLayout();
     
//setting the layout to the object we created above which is called 'f'
     setLayout(f);
     
     //Calls the Look and Feel method
     setLookAndFeel();
     
    // Sets the frame size 
    setSize(600,250);
    
    //Creating JButtons (Currently doesn't do anything)
    JButton start= new JButton("Start");
    JButton finish= new JButton("Finish");
    
    //Adding the created Jbuttons to the frame
    add(start);
    add(finish);
    
    // Creating a JLabel which is flushed to the right
    JLabel l =new JLabel("Social Media Profile: ",JLabel.CENTER);
    
// Creating a JTextField which is 25 charecters wide
    JTextField fl= new JTextField(25);
    
    //Adding the created JLabel and JTextField to the frame
    add(l);
    add(fl);
    
    // This creates an object that retrieves a user's input text
    JTextField text= new JTextField(25);
    String uInput= text.getText();
    
    // Creating a JTextField to display a specific message (in this case it display "hello")
    JTextField text2= new JTextField(25);
    text2.setText("Hello");
    add(text2);
    
    // Creating CheckBox objects where b2 is initinally checked
    JCheckBox b1= new JCheckBox("First Box ");
    JCheckBox b2= new JCheckBox("Second Box ",true);
    
    // Creating a button group which holds the two above checkboxes in a group
    // This way, only one of the two can be checked at a time
    ButtonGroup boxes = new ButtonGroup();
    //Adding the two checkboxes to the button group
    boxes.add(b1);
    boxes.add(b2);
    
    // Adding the check boxes to the frame
    add(b1);
    add(b2);
    
    
    // Creating a drop-down list of options to select from which is refereed to as ComboBoxes
    JComboBox cb = new JComboBox();
    // Adds options to selcet from to the ComboBox
    cb.addItem("Option 1");
    cb.addItem("Option 2");
    cb.addItem("Option 3");
    
    // This allows the user to input his/her own option instead
    cb.setEditable(true);
    
    // Adds the ComboBox to the frame
    add(cb);
    
    // Creating a JtextArea which is an area where the user can write in multiple lines of comments
    // Here it is set for a width of 50 chartercters and a height of 7 lines 
    JTextArea comment= new JTextArea("Feel free to write your commment Here: \n",7,40);
    
    // Adding the JTextArea to the frame
    add(comment);
    
    // This line causes the text to wrap to the next line
    comment.setLineWrap(true);
    // This determines how the text wraps to the next line, true=based on where the word ends,
    // and false based on characters
    comment.setWrapStyleWord(true);
    
    // This creats a scrollPane with a horizantal scrollbar for the TextArea we created earlier 
    //then adds it to the frame
    JScrollPane scroll = new JScrollPane(comment,
            JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
            JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        add(scroll);
    
    //Exits the Interface When the close button is clicked
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    //This displays the frame, set it to false to stop the frame from being displayed
    setVisible(true);
    
    }
    // This function sets the "look and feel" of the frame to one called "Nimbus" using a try-catch block
     private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc) {
            // ignore error
        }
    }
    public static void main(String[] args) {
        // Creates a new frame 
        MainFrame m= new MainFrame();
    }

    
    
}
