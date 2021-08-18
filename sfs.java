// напечатать массив, а затем максимальный и минимальный элемент в каждой строке
import java.lang.reflect.Array;

public class sfs {
    public static void main(String[] args) {
        int[][] numbers = {{92, - 108, 2, 120, 67, 133, 99,88},
            {4, - 81, 9, 88, 1, 123, - 100, 999},
            {4, 81, 9, 88, 1, 11, 99, 44},
            {4, - 81, 9, 88, 1, 4, 5, 5},
            {- 81, 9, 88, 1, 44, 88, 11, - 111}};
 
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        
        int[][] res = new int[numbers.length][2];
        
        for (int i = 0; i < numbers.length; i++) {
            int min = numbers[i][0];
            int max = numbers[i][0];
            for (int j = 0; j < numbers[0].length; j++) {
                if (min > numbers[i][j]) {
                    min = numbers[i][j];
                }
                if (max < numbers[i][j]) {
                    max = numbers[i][j];
                }
            }
            System.out.print("Максимальный элемент " + max + " Минимальный элемент " + min + " \n");
            
            Array.setInt(res[i], 0, max);
            Array.setInt(res[i], 1, min);
        }
        
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}