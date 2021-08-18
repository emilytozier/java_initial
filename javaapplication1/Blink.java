/*
 * реализация гирлянды (мигание) в побитовом исполнении
 */
package javaapplication1;

import java.util.Scanner;

public class Blink {
    public static void main(String args[]){
        int k=0;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите сколько раз мигает гирлянда: "); 
        k = scan.nextInt();
        int num = 0b00101011_01010101_11000011_01101001;
        
    
                
        while (k-- > 0) {
            num = ~num;
            String s = String.format("%32s", Integer.toBinaryString(num)).replace(' ', '0');
            System.out.println(s);
            //System.out.print(Integer.toBinaryString(num)+"\n");
        }
        
    }
    
}
