/*
 * check if number is less than 10 and positive OR not
 */
package javaapplication1;

/**
 *
 * @author Emily
 */
import java.util.Scanner;
  
public class scanNumber {
     public static void main(String args[]){
        int k =0;     
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое число: "); 
        k = scan.nextInt();
        if (0 < k && k <= 10) {
            System.out.println("Положительное число меньше или равное 10");

        } else {
            System.out.println("Положительное число больше 10 или отрицательное");
        }
}
    
}
