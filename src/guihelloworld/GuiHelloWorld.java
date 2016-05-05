/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guihelloworld;

/**
 *
 * @author 75767
 */
import javax.swing.JOptionPane;
import javax.swing.JFrame;
//import java.util.Scanner;
public class GuiHelloWorld {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
       // Scanner scan = new Scanner(System.in);
        JFrame myFrame = new JFrame("Hello GUI World");
        String myName = JOptionPane.showInputDialog("Please enter your name:");
        double cat1 = Double.parseDouble(JOptionPane.showInputDialog("Enter CAT 1 marks:"));
        double cat2 = Double.parseDouble(JOptionPane.showInputDialog("Enter CAT 2 marks:"));
        double cat3 = Double.parseDouble(JOptionPane.showInputDialog("Enter CAT 3 marks:"));
        double sum = cat1 + cat2 + cat3;
        double avg = sum/3;
        JOptionPane.showMessageDialog(myFrame, "Hello Mr." + myName + "Your "
                + "average for the three CATs is: " + avg);
        System.exit(0);
        
    }
    
}
