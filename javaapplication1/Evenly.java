/*
 * четное или нечетное число введено
 */

//7 УРОК
//Первое задание
package javaapplication1;
import java.util.Scanner;

public class Evenly {
    public static void main(String args[]){
	        int num = 0;
                
                Scanner scan = new Scanner(System.in);
                System.out.print("Введите любое целое число: ");
                if(scan.hasNextInt()) {
                    num = scan.nextInt();
                    if (num%2==0) {
                        System.out.println ("Вы ввели четное число " + num);                    
                    } else {
                       System.out.println ("Вы ввели нечетное число " + num);  
                    }
                } else {
                        System.out.println ("Вы ввели не целое число ");
                }
    }
}
            
                    
