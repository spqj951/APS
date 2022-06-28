import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[7];
        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }

        for(int i = array.length-1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j]= array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
