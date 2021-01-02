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
import java.util.ArrayList;
import java.util.Scanner;
 
public class s6123805115_2 {
 
    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);
        ArrayList <Double> list = new ArrayList<Double>();
         
        int i = 1;
        while(i <= 2)
        {
            System.out.printf("กรุณากรอกตัวเลขครั้งที่�%d : ", i);
            list.add(scan.nextDouble());
            i++;
        }
        scan.close();
         
        Double sum = list.stream().mapToDouble(Double::doubleValue).sum();
        System.out.printf("ผลรวมทั้งหมด คือ %.2f", sum);       
    }
}