import java.util.*;
public class LargestInArray {
    public static void main(String[] args) {

    }

    public static int largestElement(int arr[]){
        int large = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if (arr[i] > large){
                large = arr[i];
            }
        }
        return large;
    }
}
