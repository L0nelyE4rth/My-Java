/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tanawat;

/**
 *
 * @author tanaw
 */
import java.util.Scanner;
public class s6123805115_2 {
        public static void main(String[] args){
            Scanner a = new Scanner(System.in);
            System.out.print("Enter student ID : ");
            long num1 = a.nextLong();
            
            Scanner b = new Scanner(System.in);
            System.out.print("Enter name : ");
            String name = b.nextLine();
            
            Scanner c = new Scanner(System.in);
            System.out.print("Enter Age : ");
            int num2 = c.nextInt();
            
            Scanner d = new Scanner(System.in);
            System.out.print("Enter GPA : ");
            float num3 = d.nextFloat();
            
        System.out.println("Your student ID is "+ num1);
        System.out.println("Your name is "+ name);
        System.out.println("You age is "+ num2);
        System.out.println("You GPA is "+ num3);
    }
}
