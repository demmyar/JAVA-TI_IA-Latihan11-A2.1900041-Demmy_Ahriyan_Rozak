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
 * Percobaan 1 Menggunakan class BufferedReader
 */
 import java.io.BufferedReader; 
 
 import java.io.IOException; 
 
 import java.io.InputStreamReader; 


public class GetInputFromKeyboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(     
System.in) ); 
        String name = ""; 
 
 
        System.out.print("Please Enter Your Name:");        
        
        try{    
            name = dataIn.readLine(); 
 
        }catch( IOException e ){ 
 
            System.out.println("Error!");    
        } 

        System.out.println("Hello " + name +"!");  
 
    }
    
}
