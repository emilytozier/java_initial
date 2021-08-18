/*
Передать на вход программы число От 1 до 7 в качестве аргумента.
Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее. 
Если 6 или 7 – “Выходной”. Используем конструкцию switch-case. 
 */

/**
 *
 * @author Emily
 */
public class switchCase {
    public static void main(String[] args) {
        System.out.print("Введите целое число от 1 до 7 (день недели): "); 
        
        int day = Integer.parseInt(args[0]);        
        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
            case 7:
                System.out.println("Выходной");
                break;
        }
 
          
    }
}
