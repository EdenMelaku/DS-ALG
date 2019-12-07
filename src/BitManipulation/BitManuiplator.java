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


    public static void main(String...args){
        System.out.println(updateBits(90,20,2,6));
}


}
