/*
 * create 2 girlands of 1 and 0 and make them blink
 * 
 */
package javaapplication1;

import java.util.Scanner;
public class blinkMassive {
    public static void main(String args[]){
        int k=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите сколько раз мигает гирлянда: "); 
        k = scan.nextInt();  
        
        int[] currentState = new int[16];// делаем первый массив
        int[] res = new int[16];// делаем 2 массив        
        for (int i = 0; i < currentState.length; i++) {
            if (i%2==0) {
                currentState[i] = 1;
                res[i] = 0;
            } else {
                currentState[i]=0;
                res[i] = 1;
            }
        }      
        int x = 0; 
        
        if (k%2==0){
            for (x=0; x<k/2; x++) {
                for (int j = 0; j < res.length; j++) {            
                    System.out.print(res[j]);
                }
                System.out.println();
            
                for (int l = 0; l < currentState.length; l++) {
                    System.out.print(currentState[l]);
                }
                System.out.println();
            }
                
        } else{
            for (x=0; x<k/2; x++) {
                for (int j = 0; j < res.length; j++) {            
                    System.out.print(res[j]);
                }
                System.out.println();
            
                for (int l = 0; l < currentState.length; l++) {
                    System.out.print(currentState[l]);
                }
                System.out.println();
                
            }
            for (int j = 0; j < res.length; j++) {            
                System.out.print(res[j]);
            }
            System.out.println();
            
        } 
    }
}