
import java.lang.reflect.Array;
import java.util.Arrays;

/*
 * print 5x8 massive; find min and max elements and print them in new massive
 */

/**
 *
 * @author Emily
 */
public class array5 {
    public static void main(String[] args) {
        System.out.println("Первый   массив: ");
        int[][] array5 = {
            {5,6,67,90,23,6,89,88},
                {11,22,33,44,55,66,77,88},
                    {34,43,56,65,76,67,15,51},
                        {1,2,3,5,8,13,21,34},
                            {45,237,4558,12309,53421,67,89,1010}};         
        for (int[] array51 : array5) {
            for (int v = 0; v < array5[0].length; v++) {
                System.out.print(array51[v]+" ");
            }
            System.out.println();
        }
        System.out.println();
        int[][] array6 = new int[array5.length][2];
        for (int[] number : array5) {
            Arrays.sort(number);
            for (int i = 0; i < array6.length; i++) {  
                array6[i][0]=array5[i][7];
                array6[i][1]=array5[i][0];
            }     
           
        }
    
        System.out.println("Второй   массив: ");
        for (int l = 0; l < array6.length; l++) {
            for (int v = 0; v < array6[0].length; v++) {
                System.out.print(array6[l][v]+" ");
            }
        System.out.println();
        }

    }
}