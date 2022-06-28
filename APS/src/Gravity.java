public class Gravity {
    public static void main(String[] args) {
        int[] box = {4,4,2,6,7,6,7,7,7};

        int max = 0;

        for (int i = 0; i < box.length; i++){
            int cnt = box.length-1-i;
            for(int j = i+1; j < box.length; j++){
                if(box[j] >= box[i]){
                    cnt--;
                }
            }// end for j
            if(max < cnt){
                max = cnt;
            }
        }// end for i

        System.out.println(max);

    }
}
