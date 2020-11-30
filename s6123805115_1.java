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
public class s6123805115_1 {
        public static void main(String[] args){
            Scanner a = new Scanner(System.in);
            System.out.print("Enter number 1 : ");
            int num1 = a.nextInt();
            
            System.out.print("Enter number 2 : ");
            int num2 = a.nextInt();
                         
        System.out.println("Result of number 1 + number 2 = "+ (num1+num2));
        System.out.println("Result of number 1 - number 2 = "+ (num1-num2));
        System.out.println("Result of number 1 * number 2 = "+ (num1*num2));
        System.out.println("Result of number 1 / number 2 = "+ (num1/num2));
    }
}