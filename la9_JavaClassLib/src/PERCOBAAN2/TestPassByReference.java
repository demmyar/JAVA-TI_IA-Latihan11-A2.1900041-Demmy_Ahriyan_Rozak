/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERCOBAAN2;

/**
 *
 * @author Demy
 * Nama     :   Demmy Ahriyan Rozak
 * NIM      :   A2.1900041
 * Kelas    :   TI-IA
 * Percobaan 2 Pass by reference 
 */
public class TestPassByReference {
    public static void main(String[] args) { 
 
    int []ages = {10,11,12}; 
 
    for(int i=0;i<ages.length;i++){ 
 
    System.out.println(ages[i]); 
 
        } 
 
    test(ages); 
 
    for(int i=0;i<ages.length;i++){ 
 
    System.out.println(ages[i]); 
 
        } 
 
 } 
 
 public static void test(int []arr){ 
 
    for(int i=0;i<arr.length;i++){ 
 
        arr[i]=i+50; 
 
        } 
 
    }
}
