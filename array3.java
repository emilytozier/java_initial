/*
 * print massive 6x3
 */

/**
 *
 * @author Emily
 */
public class array3 {
    public static void main(String[] args) {
        String[][] array3 = {
            {"a1","a2","a3","a4","a5","a6"},
                {"b1","b2","b3","b4","b5","b6"},
                    {"c1","c2","c3","c4","c5","c6"}                    
        };
        for (String[] arrayPrint : array3) {
            for (String element : arrayPrint) {
                System.out.print(element + " ");            
            }
        System.out.println();
        }        
    }
}
