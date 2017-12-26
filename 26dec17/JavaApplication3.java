/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Caesar cipher algorithm
package javaapplication3;
import java.util.*;
import java.io.*;

/**
 *
 * @author student
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static StringBuffer encryption(String encrypt,int shifts)
    {
        int i;
        StringBuffer ans=new StringBuffer();
        for(i=0;i<encrypt.length();i++)
        {
            if(Character.isUpperCase(encrypt.charAt(i)))
            {
                char ch=(char)(((int)encrypt.charAt(i)+shifts-65)%26+65);
                ans.append(ch);
            }
            else if(Character.isWhitespace(encrypt.charAt(i)))
            {
                 //char ch=(char)(((int)encrypt.charAt(i)+shifts-65)%26+65);
                ans.append(encrypt.charAt(i));
            }
            else
            {
                
                char ch=(char)(((int)encrypt.charAt(i)+shifts-97)%26+97);
                ans.append(ch);
            }
        }
        return ans;
        
    }
     public static StringBuffer decryption(String decrypt,int shifts)
    {
        int i;
        shifts=26-shifts;
        StringBuffer ans=new StringBuffer();
        for(i=0;i<decrypt.length();i++)
        {
            if(Character.isUpperCase(decrypt.charAt(i)))
            {
                char ch=(char)(((int)decrypt.charAt(i)+shifts-65)%26+65);
                ans.append(ch);
            }
            else if(Character.isWhitespace(decrypt.charAt(i)))
            {
                 //char ch=(char)(((int)encrypt.charAt(i)+shifts-65)%26+65);
                ans.append(decrypt.charAt(i));
            }
            else
            {
                
                char ch=(char)(((int)decrypt.charAt(i)+shifts-97)%26+97);
                ans.append(ch);
            }
        }
        return ans;
        
    }
    public static void main(String[] args) {
        int choice;
         int shifts;
         String decrypt;
            
         Scanner scan=new Scanner(System.in);
         String encrypt;
      
         do
        {
              System.out.println("Enter the choice to be performed:\n1.Encryption\n2.Decryption\n3.exit\n");
       
        choice=scan.nextInt();
          Scanner get=new Scanner(System.in);
       
        if(choice==1)
        {
        System.out.println("Enter the text to be encrypted:\n");
       
         encrypt=get.nextLine();
         System.out.println("Enter the number of shifts:\n");
      
         shifts=scan.nextInt();
         System.out.println("The text before encryption: "+encrypt);
         System.out.println("Number of Shifts: "+shifts);
        System.out.println("Encrypted text:"+ encryption(encrypt,shifts));
        
    }
        else if(choice ==2)
        {
              System.out.println("Enter the text to be decrypted:\n");
        
         decrypt=get.nextLine();
         System.out.println("Enter the number of shifts:\n");
         
         shifts=scan.nextInt();
         System.out.println("The text before Decryption: "+decrypt);
         System.out.println("Number of Shifts: "+shifts);
        System.out.println("decrypted text:"+ decryption(decrypt,shifts));
        }
        else
            break;
        }while(choice!=3);
    
}
}
