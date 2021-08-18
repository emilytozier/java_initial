/*
 * реализация гирланды (побитовой) в режиме бегущей строки
 */
package javaapplication1;

import java.util.Scanner;
import java.lang.Long;

public class Shift {
    public static void main(String args[]){
        int k=0;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите сколько раз перебирается гирлянда: "); 
        k = scan.nextInt();
        int num = 0b01001001_11011101_00001000_11011101;
    
                
        while (k-- > 0) {
            num = num<<1;
            String s = String.format("%32s", Integer.toBinaryString(num)).replace(' ', '0');
            System.out.println(s);
            //System.out.printf("%016d", Long.parseLong(Integer.toBinaryString(num)));

        }      
    }
}
