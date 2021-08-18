/*
 * Распечатать 5 символов в одну строку начиная с ‘h’. Используем цикл for.
 * 
 */

/**
 *
 * @author Emily
 */
public class forTask {
  
    public static void main(String[] args){
            System.out.print("Symbols: ");
        for (int i = 72; i < 77; i++) {
            char ch = (char) i;
            System.out.printf(i +" "+ ch +" ");
        }
    }
}

