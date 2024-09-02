import java.util.Random; 
// Merge sort Algorithm 
public class Merge {
    public static void main (String [] args){
        int [] arrays = new int [100];
        Random rand = new Random ();
        for (int i =0; i < arrays.length; i ++){
            arrays [i] = rand.nextInt (1000) + 1;
        }
      // creating initial array 

        mergeSort (arrays);
    }

    public static void mergeSort (int [] array){
        int length = array.length;
        int mid = length/2;

        if (length <2){
            return; 
        }


        int [] leftArray = new int [mid];
        int [] rightArray = new int [length -mid];

        for (int i =0; i < leftArray.length ; i ++){
            leftArray [i] = array[i];
        }

        for (int i = mid; i < rightArray.length; i ++){
            rightArray [i - mid] = array [i];
        }

        mergeSort (leftArray);
        mergeSort (rightArray);

        merge (array, leftArray, rightArray);

    }

    public static void merge (int [] leftArray, int [] rightArray, int [] array){
        int leftLength = leftArray.length;
        int rightLength = rightArray.length;

        int k = 0, j = 0, i = 0;
        while (i <leftLength && j < rightLength){
            if (leftArray [i] <= rightArray [j]){
                array [k] = leftArray [i];
                i ++;
            }
            else {
                array [k] = rightArray [j];
                j ++;
            }
            k ++;
        }
        // fills the array with sorted ints
        while  (i <leftLength){
            array [k] = leftArray [i];
        }
        // used if empty left array
        while (j < rightLength){
            array [k] = rightArray [j];
        }
        // empty right Array 

    }   
}           
