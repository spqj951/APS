import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {0,4,1,3,1,2,4,1};

        //최대값 찾기
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        int[] cnt = new int[max+1];
        for(int i = 0; i < arr.length; i++){
            cnt[arr[i]]++;
        }
        //누적합 구하기
        for(int i =1; i < cnt.length; i++){
            cnt[i] = cnt[i-1]+cnt[i];
        }

        int[] sorted = new int[arr.length];
        for(int i = arr.length-1; i >=0; i--){
            cnt[arr[i]]--;
            sorted[cnt[arr[i]]]= arr[i];
        }
        System.out.println(Arrays.toString(sorted));
    }
}
