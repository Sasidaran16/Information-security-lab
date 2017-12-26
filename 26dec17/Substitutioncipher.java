/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.io.*;
import java.util.*;
/**
 *
 * @author student
 */
public class Substitutioncipher {
    public static void main(String args[])
    {
        
        char let[]={'q','w','e','r','t','y','u','i','o','p','z','x','c','v','b','n','m','a','s','d','f','g','h','j','k','l'};
        char caps[]={'Q','W','E','R','T','Y','U','I','O','P','Z','X','C','V','B','N','M','A','S','D','F','G','H','J','K','L'};
       int choice;
       Scanner scan;
        String txt;
        do
       {
           
           System.out.println("1.Encryption\n2.Decryption\n3.Exit\n");
           scan =new Scanner(System.in);
           choice=scan.nextInt();
           if(choice==1)
           {
               StringBuffer ans1=new StringBuffer();
              
        System.out.println("Enter the text to be encrypted:\n");
       Scanner get=new Scanner(System.in);
        txt=get.nextLine();
        int i;
        for(i=0;i<txt.length();i++)
        {
            if(Character.isLowerCase(txt.charAt(i)))
            {
            int a=((int)txt.charAt(i)-97);
            ans1.append(let[a]);
            }
            else if(Character.isUpperCase(txt.charAt(i)))
            {
                  int a=((int)txt.charAt(i)-65);
            ans1.append(caps[a]);
            }
            else
            {
                ans1.append(txt.charAt(i));
            }
            
        }
        System.out.println("Encrypted text is:"+ans1);
           }
           else if(choice==2)
           {
               StringBuffer ans2=new StringBuffer();
              
                System.out.println("Enter the text to be decrypted:\n");
       Scanner get=new Scanner(System.in);
        txt=get.nextLine();
        int i;
        for(i=0;i<txt.length();i++)
        {
            if(Character.isLowerCase(txt.charAt(i)))
            {
             
            for (int j = 0; j <= 25; j++)
            {
             if (let[j]==txt.charAt(i))
                {
                 
                
                    ans2.append((char)(97+j));
                    break;
                }
             
            }
            
            }
            else if(Character.isUpperCase(txt.charAt(i)))
            {
                 for (int j = 0; j <= 25; j++)
            {
             if (caps[j] ==txt.charAt(i))
             {
                    ans2.append((char)(65+j));
                   break;
                }
             
            }
            }
        
           
            else
            {
                ans2.append(txt.charAt(i));
                break;
            }
           }
        System.out.println("Decrypted text is:"+ans2);
        }
           else
               break;
           
    
       }while(choice!=3);
}
}
