/*
 * print char massive 4x2
 */

/**
 *
 * @author Emily
 */
public class array4 {
    
    public static void main(String[] args) {
        
        char[][] array4 = { 
            {'l','j'},
            {'i','a'},
            {'k','v'},
            {'e','a'}
    };
    for (char[] arrayPrint : array4) {
        for (char element : arrayPrint) {
            System.out.print(element + " ");            
        }
        System.out.println();
        }        
    }
}
