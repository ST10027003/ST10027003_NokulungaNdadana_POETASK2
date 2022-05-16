
import java.util.Scanner;
import javax.swing.JOptionPane;
import static login.Nokulunga;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nokulunga Ndadana
+
*/
public class Task {
    public static void main (String [] args) {
        Scanner Nokulunga = new Scanner (System.in);
        
        int choice = Nokulunga.nextInt();
        if (choice == 1) {
            int product = Nokulunga.nextInt();
        }
        if (choice == 2) {
            int report = Nokulunga.nextInt();
        }
        while (choice < 3) {
                choice = choice +1;
            }       
    }
    
 
}

