public class BinarySearch_Recursion {
    public static void main(String[] args) {
        int[] arr = {2,4,7,9,11,19,23};
        binarySearch(arr, 0, arr.length-1, 11);
    }
    public static void binarySearch(int[] arr, int low, int high, int key){
        if(low > high){
            System.out.println("not here");
        }
        int middle = (low+high)/2;
        if(key == arr[middle]){
            System.out.println("here it is");
        }
        else if(key > arr[middle]){
            binarySearch(arr, low+1, high, key);
        }
        else {
            binarySearch(arr, low, high+1, key);
        }
    }
}
