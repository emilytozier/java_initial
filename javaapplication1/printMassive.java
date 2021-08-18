/*
 * print the current state of girland
 */
package javaapplication1;

/**
 *
 * @author Emily
 */
public class printMassive {
    public static void main(String args[]){ 
        System.out.println("Текущее состояние гирлянды: ");
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
        for (int l = 0; l < currentState.length; l++) {
                System.out.print(currentState[l]);
            }
            System.out.println();
    }
}
