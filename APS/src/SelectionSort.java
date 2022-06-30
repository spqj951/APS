import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 10, 22, 11, 0, 11, 0 ,23};

        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                int minIdx = i;
                if(arr[minIdx] > arr[j]){
                    int tmp = arr[minIdx];
                    arr[minIdx] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
