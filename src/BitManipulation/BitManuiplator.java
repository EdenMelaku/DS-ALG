package BitManipulation;

public class BitManuiplator {

    /*
    You are given two 32-bit numbers, N and M, and two bit positions, i and j. Write a
method to set all bits between i and j in N equal to M (e.g., M becomes a substring of
N located at i and starting at j).
EXAMPLE:
Input: N = 10000000000, M = 10101, i = 2, j = 6
Output: N = 10001010100
     */

    public static int updateBits(int n, int m, int i, int j) {
         int max = ~0; /* All 1’s */

         // 1’s through position j, then 0’s
         int left = max - ((1 << j) - 1);

         // 1’s after position i
         int right = ((1 << i) - 1);

         // 1’s, with 0s between i and j
         int mask = left | right;

         // Clear i through j, then put m in there
         return (n & mask) | (m << i);
         }

         // this method sets the jth bit of the number i to 1
     public int setBit(int i, int j){
        return (i|(1<<j));
     }
// this method clears a bit (sets the jth bit of the number i to 0)
    public int clearBit(int i,int j){
        int mask=~(1<<j);
        return i&mask;
    }
    // this updates a bit
   public int updateBit(int i,int j, boolean set){
       int value=(set)?1:0;
       int mask=~(1<<j);
       int clear=mask&i;
       return clear|(1<<value);

}

    int isPowerOfTwo(int x){
        int n= (x & (x - 1));
        if(x==0) return x;
        return  n;
    }

    int countOne(int x){
        int count=0;
        while (x!=0){
            x=x&(x-1);
            count++;
        }
        return count;
    }

    boolean isSet(int n, int i){
        int mask=~(1<<i);
        int x=n|mask;
        return x==~(0);
    }

    static void  possibleSubsets(char A[])
    {
        int N=A.length;
        for(int i = 0;i < (1 << N); ++i)
        {
            for(int j = 0;j < N;++j)
                if((i & (1 << j))!=0)
                    System.out.print( A[j] +" ");
            System.out.println();
        }
    }

    static int findLargestPowerOf2InRange(int N){
        //changing all right side bits to 1.
        N = N| (N>>1);
        N = N| (N>>2);
        N = N| (N>>4);
        N = N| (N>>8);


        //as now the number is 2 * x-1, where x is required answer, so adding 1 and dividing it by

        return (N+1)>>1;
    }

    public static int missingInteger(int[]A){
        for(int i=0;i<A.length;i++) {
            if(((A[i]+1)^(A[i+1]))!=0){
                return A[i]+1;
            }
        }
        return A.length;
    }

    public static void main(String...args){
        System.out.println(updateBits(90,20,2,6));

        char[] A={'A','B','C'};
        possibleSubsets(A);

        System.out.println(findLargestPowerOf2InRange(6));
        System.out.println(6>>1);
        int[]nums={1,2,3,5,6};
        System.out.println(missingInteger(nums));
}



}
