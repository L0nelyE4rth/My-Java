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
            double rate = 150;
            int standard = 40;
            double pay;
            
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter your working hours : ");
            
            int hour = scan.nextInt();
            if(hour > standard)
                pay = standard*rate + (hour-standard)*(rate*1.5);
            else
            {
                pay = hour*rate;
            }
            System.out.println("Pay = "+pay);
        }
}
