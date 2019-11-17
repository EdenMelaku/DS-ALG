package searchingAlgorithms;
//AKA sequential search
public class searchService {
    public static int LinearSearch(int[] numbers, int key){
     for(int i=0;i<numbers.length;i++){
         if(numbers[i]==key){
             return i;
         }
     }
     return -1;
    }


}
