/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import javax.swing.JOptionPane;

/**
 *
 * @author Cartagena
 */
public class Menu {
    
    public static void Menu(){
        String option1 = "";
        String menu1 = "Choose an option.\n1 - Register equipment" + "\n2 - View equipment" + "\n0 - Exit";
     
        do {
            option1 = JOptionPane.showInputDialog(menu1);
            switch(option1) { 
                case "0":
                   JOptionPane.showMessageDialog(null, "END OF PROGRAM");
                   break;                  
                case "1":
                    register();                
                    break;                   
                case "2":
                    viewData();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Incorrect option");
            }
        }while(!option1.equals("0"));
    }
    
    public static void register(){   
        
        String option = "";
        String menu = "Register equipment.\n1 - Desktops" + "\n2 - Laptops" + "\n3 - Tablets" + "\n0 - Back"; 
        
        do {
           option = JOptionPane.showInputDialog(menu);
           switch(option){                  
            case "1":
                JOptionPane.showMessageDialog(null, "REGISTER DESKTOPS");  
            break;            
            case "2":
                JOptionPane.showMessageDialog(null, "REGISTER LAPTOPS");
                break;                
            case "3":
                JOptionPane.showMessageDialog(null, "REGISTER TABLETS");
                break;
            case "0":
                JOptionPane.showMessageDialog(null, "Exit Register");
                break;    
            default:
                JOptionPane.showMessageDialog(null, "Incorrect option");
            }         
           
        }while(!option.equals("0"));
        
    }
    
    public static void viewData(){
        String option = "";
        String menu = "View equipment.\n1 - Desktops" + "\n2 - Laptops" + "\n3 - Tablets" + "\n0 - Regresar";        
        
        do {
          option = JOptionPane.showInputDialog(menu);
          switch(option){     
            case "1":
                JOptionPane.showMessageDialog(null, "VIEW DESKTOPS");          
            break;       
            case "2":
                JOptionPane.showMessageDialog(null, "VIEW LAPTOPS");
                break;     
            case "3":
                JOptionPane.showMessageDialog(null, "VIEW TABLETS");
                break;
            case "0":
                JOptionPane.showMessageDialog(null, "Exit View");
                break;  
            default:
                JOptionPane.showMessageDialog(null, "Incorrect option");
            }  
        }while(!option.equals("0"));   
    }
}

