/*
 * print avergae of 3 numbers
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArithmAverage {
    public static void main(String[] args) {
            System.out.print("Введите любые 3 числа: ");
            Scanner scan = new Scanner(System.in);
            ArrayList<Double> doubleValues;
            doubleValues = new ArrayList<>();
            double sum = 0.0;
 //           ArrayList<String[]> list = new<String[]> ArrayList();
            for (int i = 0; i < 3; i++) {
                String input = scan.nextLine();
                double result = Double.parseDouble(input.replaceAll(" ","."));
                doubleValues.add(result);
            }
            for (Double arg : doubleValues) {
                sum += arg;
            }    
            if (doubleValues.size() == 0) {
                System.out.print("Среднее введенных Вами чисел = 0" + "\n");
           
            } else {
                System.out.print("Cреднее значение введенных Вами чисел " + sum / 3 + "\n");
            } 
            
      
    }
}

