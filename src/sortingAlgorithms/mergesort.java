package sortingAlgorithms;

public class mergesort {
    public static int[] merge(int arr[], int low,int high){
         int mid = (high+low)/2;
         int L []=new int[mid-low+1];
         int R []=new int[high-mid];
         System.out.println("low, high, mid = ( "+ low+","+high+" ,"+mid);
         for(int i=0;i<mid-low+1;i++){
             L[i]=arr[i+low];

         }
         System.out.print("Left  ");
         printArray(L);
         for(int i=0;i<high-mid;i++){
             R[i]=arr[mid+1+i];
         }
        System.out.print("right  ");
        printArray(R);

        int i,j,k;
         for( i=0,j=0,k=low;i<L.length&&j<R.length;){
             if(L[i]<R[j]){
                 arr[k++]=L[i++];
             }
             else{
                 arr[k++]=R[j++];
             }
         }

         while(i<L.length) arr[k++]=L[i++];
         while(j<R.length) arr[k++]=R[j++];


         return arr;

    }
    public static int[] mergesort(int array[], int low,int high) {
        if (low < high) {
            int mid = low + (high-low) / 2;
            mergesort(array, low, mid);
            mergesort(array, mid + 1, high);
            merge(array, low, high);
            printArray(array);
        }
        return array;
    }
    public static void  printArray(int[]array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" , ");
        }
        System.out.println();
    }
    public static void main(String ... args) {
        int [] array1 = {3,7,25,6,9,1,22,15};
        int[] array={110, 80, 30, 90, 40, 50, 70};
        System.out.println("INITIAL");
        printArray(array1);
        array=mergesort(array1,0,array1.length-1);
        printArray(array1);
    }
}
