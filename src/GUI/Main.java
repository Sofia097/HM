/*
Ángela Sofía Peña Olvera.
2022684
 */
package GUI;

import java.awt.Color;
import javax.swing.JFrame;

public class Main {
    
    public static void main (String[] args){
        
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setTitle("Cesba");
        
        frame.setResizable(true);
        
        frame.getContentPane();
        
        //FORMATO DEFAUL:
        //frame.getContentPane().setBackground(Color.green);
        
        //FORMATO RGB:
        //frame.geTContentPane().SetBackground(new Color(28,26, 198);
        
        //FORMATO HEXADECIMAL:
        frame.getContentPane().setBackground(new Color (0x1AC3C6));
        
    }   
    
}
