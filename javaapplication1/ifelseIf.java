/*
/*
Передать на вход программы число От 1 до 7 в качестве аргумента.
Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее. 
Если 6 или 7 – “Выходной”. Используем конструкцию if-else-if. 
 */
 
package javaapplication1;

/**
 *
 * @author Emily
 */
public class ifelseIf {   
    public static void main(String[] args) {
        System.out.print("Введите целое число от 1 до 7 (день недели): "); 
        
        int day = Integer.parseInt(args[0]);        
        if (day == 1) {
           System.out.println("Понедельник");
        } else if (day == 2) {
            System.out.println("Вторник");
        } else if (day == 3) {
            System.out.println("Среда");
        } else if (day == 4) {
            System.out.println("Четверг");
        } else if (day == 5) {
            System.out.println("Пятница");
        } else if (day ==6 || day==7){
            System.out.println("Выходной");
        } else {
            System.out.println("Не верное число");
        }
        



}

}
    

