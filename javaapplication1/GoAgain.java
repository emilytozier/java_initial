/*
 * Вычислить среднее значение трех вещественных чисел передаваемых на вход программы в качестве аргументов. 
Для преобразования из String в double используйте метод Double.parseDouble(String s).
 */
package javaapplication1;

import java.text.DecimalFormat;
import java.util.*;

public class GoAgain {
    
    public static void main(String[] args) {               
            
            ArrayList<Double> doubleValues;
            doubleValues = new ArrayList<>();
            for (int i = 0; i < args.length; i++) {
                doubleValues.add(Double.parseDouble(args[i]));
            }                                  
           
            double sum = 0.0;
                        
            for (Double arg : doubleValues) {
                sum += arg;
            }    
            double finish = sum / 3;
            DecimalFormat df = new DecimalFormat("###.#");
                       
            if (doubleValues.size() == 0) {
                System.out.print("Среднее введенных Вами чисел = 0" + "\n");
            } else {            
            System.out.print("Cреднее значение введенных Вами чисел " + df.format(finish) + "\n");
            }          
    }
}
