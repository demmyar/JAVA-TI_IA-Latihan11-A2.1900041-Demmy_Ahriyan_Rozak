/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan6;

/**
 *
 * @author Demy
 * Nama     :   Demmy Ahriyan Rozak
 * NIM      :   A2.1900041
 * Kelas    :   TI-IA
 * Percobaan 6 Penggunaan Operator Logika Eksklusive OR
 */
public class TestXOR {
    public static void main( String[] args ){   
            
        boolean val1 = true;
        boolean val2 = true;    
        System.out.println(val1 ^ val2); 
 
        val1 = false;    
        val2 = true;    
        System.out.println(val1 ^ val2);   
        
        val1 = false;    
        val2 = false;    
        System.out.println(val1 ^ val2); 
 
        val1 = true;    
        val2 = false;    
        System.out.println(val1 ^ val2);  
    }
}
