
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Nokulunga Ndadana
 */
public class login {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Nokulunga =new Scanner(System.in);
        System.out.println("Hi there, please enter your  first name");
        String firstname=Nokulunga.nextLine();
        System.out.println(firstname +  "successfully registered");
        
        System.out.println("Please enter your last name");
        String lastname=Nokulunga.nextLine();
        System.out.println(lastname +  "successfully registered");
        
        System.out.println("Please enter your username. Username must contain an underscore and is no longer than 5 characters long");
        String username=Nokulunga.nextLine();
        System.out.println(username +  "successfully registered");
        checkUserName(username);
        
        System.out.println("Please enter your password. Password must contain a capital letter, a digit, a special character and must be atleast 8 characters long");
        String password=Nokulunga.nextLine();
        
        System.out.println(password +  "sucessfully registered");
        checkPasswordComplexity (password);
        
        System.out.println("Username Sucessfully captured");
        checkUserName(username);
        
        System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length ");
        System.out.println("Password successfully captured");
        System.out.println("Password is not correctly formatted, please ensure that your password contains a capital letter, a number, a special character and must be atleast 8 characters long");
        System.out.println("You are successfully registered");
        System.out.println("Welcome back, it is great to see you again");
        JOptionPane.showMessageDialog(null, "Welcome to EasyKanBan");
        // Prompting the user to choose one of the options
        JOptionPane.showInputDialog(null,"Press 1 to add task" + '\n' +"Press 2 to show report" + '\n' + "Press 3 to quit" );
        
        JOptionPane.showInputDialog(null,"How many tasks would you like to add?");
        String taskNumber = Nokulunga.nextLine();
        // Prompting user to enter task name
        JOptionPane.showInputDialog("enter task name");
        String taskName = Nokulunga.nextLine();
        // Prompting user to enter task status
        JOptionPane.showInputDialog("please enter task status ");
        String taskStatus = Nokulunga.nextLine();
        //Prompting user to enter task description
        String taskDescription = Nokulunga.nextLine();
        JOptionPane.showInputDialog(null, "Please enter task description");
        JOptionPane.showInputDialog(null, "Enter a task description that is less than 50 characters");
        JOptionPane.showInputDialog(null, "Coming soon");
      // asking user to enter task details
        JOptionPane.showInputDialog("enter developer details");
        String developerDetails = Nokulunga.nextLine();
        // prompting the user to enter first name
        JOptionPane.showInputDialog("enter first name");
        String firstName = Nokulunga.nextLine();
        //prompting the user to enter their last name 
        JOptionPane.showInputDialog("enter your last name");
        String lastName = Nokulunga.nextLine();
        // prompting the user to enter task duration 
        JOptionPane.showInputDialog("enter task Duration");
        String taskDuration = Nokulunga.nextLine();
        // prompting the user to enter task status 
        JOptionPane.showInputDialog("Enter task status");
        String taskStatus = Nokulunga.nextLine();
        
    }
    public static Scanner Nokulunga= new Scanner(System.in);
    
    public static boolean checkUserName(String username){
        
        boolean underscore= false;
        boolean limit= false;
        
        for(int u=0 ;u<username.length(); u++) {
        if (username.charAt(u)==95)
           underscore=true;
        }
        if(username.length() <=5) {
            limit=true; 
        }
        if(underscore && limit ==true) {
            return true;
        }
        else
            
        
        return false;
        
    }
    
   public static boolean checkPasswordComplexity(String password) {
       
       boolean uppercase= false;
       boolean smallLetter= false;
       boolean digit= false;
       boolean specialChar= false;
       boolean length= false;
       for (int p=0; p<password.length(); p++) {
           if (password.charAt(p) >=65 && password.charAt(p)<=90) {
               uppercase= true;
           }
           if (password.charAt(p)>=97 && password.charAt(p)<=122) {
               smallLetter= true;
           }
           if (password.charAt(p)>=48 && password.charAt(p)<=57) {
               digit= true;
           }
           if (password.charAt(p)>=33 && password.charAt(p)<=47 || password.charAt(p)>=58 && password.charAt(p)<=64 || password.charAt(p)>=91 && password.charAt(p)<=96 || password.charAt(p)>=123 && password.charAt(p)<=126) {
               specialChar= true;
           }
           if (password.length()<=8) {
              length=true; 
           }
           if (uppercase && smallLetter && digit && specialChar && length == true) {
        return true;
           }
           else
           {
       
        return false;
       
       
       }
   }
        return false;
        }
   
   public static boolean registerUser (String username, String password) {
       
       if (checkUserName(username)&& checkPasswordComplexity(password)==true){
           return true;
       }
       else
       {
           return false;
       
       }    
       }
   
     public static boolean logInUser (String userName, String Password) {
     
         String logPass=Nokulunga.nextLine();
         
         boolean logUserName= false;
         boolean logPassword= false;
         
         if(userName.equals(userName)) {
             
             logUserName= true;
         }
         if (logUserName && logPassword) {
            
         }
         else{
         }  
        return true || false;
         }
     
     public static boolean returnLoginStatus (String user, String Pass, String inUser, String inPass) {
         if (inUser.equals(user) && inPass.equals(Pass)==6true) {
             
             return true;
         }
       
         }
        return false;
     }
           
   
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
    
    

