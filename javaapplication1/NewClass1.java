/*
check if first bit of n is set or not


/**
 *
 *
 */

  class NewClass1 {
    public static void AnalyzeFirst(int n,
                                   int k)
    {
        if ((n & (1 << (k - 1))) > 0)
            System.out.print(k + "th bit is "+ "SET" + "\n");
        else            
            System.out.print(k + "th bit is "+ "NOT SET" + "\n");
    }
 
    
    public static void main(String[] args)
    {
        int n = 0b01001001_10110101_01001010_10101111, k = 1;
        AnalyzeFirst(n, k);
    }
}  
