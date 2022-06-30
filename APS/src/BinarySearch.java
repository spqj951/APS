public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,7,9,11,19,23};
        System.out.println(binarySearch(arr, 9));
        System.out.println(binarySearch(arr, 18));
    }
   public static boolean binarySearch(int[] arr, int key){
        int st = 0;
        int ed = arr.length-1;

        while(st <=ed){
            int mid = (st+ed)/2;
            if(arr[mid]==key){
                return true;
            }
            else if(arr[mid]> key){
                ed = mid -1;
            }
            else{
                st = mid+1;
            }
        }
        return false;
    }
}
