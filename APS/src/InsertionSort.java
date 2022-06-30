import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] data = {69,10,30,2,16,8,31,22};

        for(int i = 1; i < data.length; i++){
            int key = data[i];
            int j;
            for(j = i-1; j >=0 && data[j] > key; j--){
                data[j+1] = data[j];

            }
            data[j+1] = key;
        }
        System.out.println(Arrays.toString(data));
    }
}
