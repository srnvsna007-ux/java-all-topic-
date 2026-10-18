import javax.swing.*;
public class awtclass01
{
   void main()
   {
    //create frame add button to frame given title and size
    JFrame Frame = new JFrame("Awt Class");
    //button to print message when clicked
    JButton button = new JButton("Sankara");
    //add action listener to button to print message when button is clicked
    button.addActionListener(e -> IO.println("Button Clicked"));



   //add button to frame
   Frame.add(button);
   //set frame size
   Frame.setSize(400, 300);
   //set default close operation
   Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   //make frame visible
   Frame.setVisible(true);
   }
}