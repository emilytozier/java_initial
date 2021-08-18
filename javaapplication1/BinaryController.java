/*
 *average for 3 double values
 */
package javaapplication1;

/**
 *
 * @author Emily
 */


import java.util.ArrayList;
import java.util.Scanner;

public class BinaryController {
    public static void main(String[] args) {
            System.out.print("Введите любые три неотрицательных вещественных числа c разделителем-точкой: ");
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

