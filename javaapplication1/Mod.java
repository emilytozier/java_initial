/*
 * выводит максимальное по модулю число
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author Emily
 */

//7 УРОК
//Второе задание
public class Mod {
    public static void main(String args[]){
	        int i,j,k;
                
                System.out.print("Введите любые три числа: "); 
                Scanner scan = new Scanner(System.in);
                i = scan.nextInt();
                j = scan.nextInt();
                k = scan.nextInt();
                i = i < 0 ? -i : i;
                j = j < 0 ? -j : j;
                k = k < 0 ? -k : k;
                //
                
                if (i > j & i > k){
                    System.out.println ("Максимальное по модулю " + i);
                } else if (j > k &  j > i) {
                     System.out.println ("Максимальное по модулю " + j);
                } else {
                    System.out.println ("Максимальное по модулю " + k);
                }
    }         
}              
                

