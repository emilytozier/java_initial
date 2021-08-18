/*
 * check if lamp in girlyand is turned on or turned off
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Emily
 */
public class analyzeMassive {
    public static void main(String args[]){
        int k=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите номер лампочки от 1 до 16, которую Вы хотите проверить: "); 
        k = scan.nextInt();      
                
        int[] currentState = new int[16];// 
        for (int i = 0; i < currentState.length; i++) {
            if (i%3==0) {
                currentState[i] = 0;
            } else if (i%3==1){
                currentState[i] = 1;
            } else {
                currentState[i] = 0;
            }
        } 
        
        try {
            if (currentState[k-1] == 0) {
                System.out.print("Лампочка "+ k +"-я не включена"+"\n");
            } else if (currentState[k-1] == 1){
                System.out.print("Лампочка "+ k +"-я включена"+"\n");
            } 
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("Вы ввели номер, которого нет"+"\n");
        }
} 
}
