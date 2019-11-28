/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan1;

/**
 *
 * @author Demy
 * Nama     :   Demmy Ahriyan Rozak
 * NIM      :   A2.1900041
 * Kelas    :   TI-IA
 * Percobaan 1 Statement if 
 */
public class Grade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double grade = 92.0;  
 
        if( grade >= 90 ){  
 
            System.out.println( "Excellent!" ); 
    }
        else if( (grade < 80) && (grade >= 60)){  
 
            System.out.println("Study harder!" ); 
        }
        else{                 
            System.out.println("Sorry, you failed.");
        }          
    }  
 
}
