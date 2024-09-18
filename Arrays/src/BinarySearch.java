import java.util.*;
public class BinarySearch {
    public static int binarySearch(int arr[],int key){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = (start+end)/2;

            //compare
            if (arr[mid]==key){
                return mid;
            }
            if (arr[mid]>key){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
    return-1;
    }
    public static void main(String[] args) {

    }
}
