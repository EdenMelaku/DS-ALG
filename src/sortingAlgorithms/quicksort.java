package sortingAlgorithms;

public class quicksort {
    public static void  printArray(int[]array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" , ");
        }
        System.out.println();
    }
    public static int[] quickSort (int[] array,int high,int low ) {
        int pivot = array[high];
        int i = low - 1;
        System.out.println("pivot "+pivot+"\n"+"i = "+i);

        if (low < high) {
           // System.out.println(array.toString());

            for (int j = low; j <=high - 1; j++) {
                if (array[j] < pivot) {
                    int temp = array[j];
                    array[j] = array[++i];
                    array[i] = temp;
                    System.out.print(" SWAP( i="+i+",j="+j+" ) ---- ");
                    printArray(array);


                }
            }
            int temp = array[++i];
            array[i] = array[high];
            array[high] = temp;
            System.out.println("i = "+i);
            printArray(array);
            if(i>2) quickSort(array,i-1,low);
            quickSort(array, high, i );

        }

        return array;
    }

    public static void main(String ... args) {
        int [] array1 = {3,7,25,6,9,1,22,15};
        int[] array={10, 80, 30, 90, 40, 50, 70};
        System.out.println("INITIAL");
        printArray(array);
        array=quickSort(array,array.length-1,0);
        printArray(array);
    }
}
