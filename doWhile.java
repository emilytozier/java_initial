

/*
 * print from 1 to 100
 */

/**
 *
 * @author Emily
 */
public class doWhile {

    public static void main(String[] args) {
             
        int n = 1;
        do {
            if (n % 5 == 0) {
                System.out.println(n);
            }
        } while (++n <= 100);
        
    }
    
}
