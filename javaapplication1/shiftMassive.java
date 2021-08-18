/*
 *create girland and make it shift, as for "running string"
 */
package javaapplication1;

import java.util.Scanner;
public class shiftMassive {
    public static void main(String args[]){
        int k=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите сколько раз перебирается гирлянда: "); 
        k = scan.nextInt();      
                
        int[] currentState = new int[16];// 
        for (int i = 0; i < currentState.length; i++) {
            if (i%3==0) {
                currentState[i] = 1;
            } else if (i%3==1){
                currentState[i] = 0;
            } else {
                currentState[i] = 0;
            }
        } 
        
        int[] currentState1 = new int[16];        
        while (k-- > 0) { // 
                int tmp = currentState[0];
                System.arraycopy(currentState, 1, currentState1, 0, currentState.length - 1);
                currentState1[currentState.length - 1] = tmp;
                System.arraycopy(currentState1, 0, currentState, 0, currentState.length);
            for (int l = 0; l<currentState.length; l++) { 
                System.out.print(currentState1[l]);                
            }    
        System.out.println();
        }     
 
    }        
}