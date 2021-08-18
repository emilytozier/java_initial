/*
 *реализация гирлянды (печать) в побитовом исполнении
 */
package javaapplication1;

/**
 *
 * @author Emily
 */
public class CheckGir {
    public static void main(String args[]){
        String initial = "0b01001001_10110101_01001010_10101111";
//    private String toGraphicalView(String currentState) {
        
        String Girlyand = "";
        for (int i = 0; i < 32; i++) {
            switch (initial.charAt(i)) {
                case '1':
                    Girlyand += '\u263C';
                    break;
                case '0':
                    Girlyand += '\u2688';
                    break;
            }
            if (i < initial.length() - 1) {
                Girlyand += '\u2014';
            }
        }
           
        System.out.println(Girlyand);
    }    
}
