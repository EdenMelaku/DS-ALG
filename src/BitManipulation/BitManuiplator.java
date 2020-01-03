package BitManipulation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

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
       /* System.out.println(updateBits(90,20,2,6));

        char[] A={'A','B','C'};
        possibleSubsets(A);

        System.out.println(findLargestPowerOf2InRange(6));
        System.out.println(6>>1);
        int[]nums={1,2,3,5,6};
        int[]num={1,3,4};
        int[]numm={2,6,1,3,4};*/
        int arr[] = {4, 2, 4, 5, 2, 3, 3, 1};
        int arr1[] = {12, 23, 34, 12, 23, 8};
/*
        System.out.println(missingInteger(numm));
        System.out.println(missingNumber(numm));*/
        printTwoOdd(arr1,arr1.length);
}

/*
another solution from the web
 */

    static int missingNumber(int[] nums) {
        int ret = 0;
        for(int i = 0; i < nums.length; i++) {
            ret ^= i;
            ret ^= nums[i];
        }
        return ret^=nums.length;
    }

    static void printTwoOdd(int arr[], int size)
    {
        int xor2 = arr[0]; /* Will hold XOR of two odd occurring elements */
        int set_bit_no; /* Will have only single set bit of xor2 */
        int i;
        int n = size - 2;
        int x = 0, y = 0;
/* Get the xor of all elements in arr[]. The xor will basically
be xor of two odd occurring elements */
        for(i = 1; i < size; i++)
            xor2 = xor2 ^ arr[i];
        System.out.println("xor= "+xor2);
/* Get one set bit in the xor2. We get rightmost set bit
in the following line as it is easy to get */
        set_bit_no = xor2 & ~(xor2-1);
        System.out.println("set_bit_no= "+set_bit_no);

/* Now divide elements in two sets:
1) The elements having the corresponding bit as 1.
2) The elements having the corresponding bit as 0. */
        for(i = 0; i < size; i++)
        {
            /* XOR of first set is finally going to hold one oddoccurring number x */
            if((arr[i] & set_bit_no)!=0)
                x = x ^ arr[i];
/* XOR of second set is finally going to hold the other
odd occurring number y */
            else
                y = y ^ arr[i];
            System.out.println("x= "+x);
            System.out.println("y= "+y);

        }
        System.out.println("\n The two ODD elements are "+ x+" "+ y);
    }

    Set<ArrayList<Integer>  > getSubset(int[] arr) {
        Set<ArrayList<Integer> > subsets=new HashSet<>(1<<(arr.length-1));
        for (int i=0;i<1<<(arr.length-1);i++) {
            ArrayList<Integer> set=new ArrayList<>();
            for(int j=0;j<arr.length;j++){
                int x=i&j<<1;
                if(x!=0) {
                    set.add(i);
                }
            }
        }
        return subsets;
    }
}
