import java.util.Scanner;

public class BabyGin_greedy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cards = new int[6];
        for(int i =0; i < cards.length; i++){
            cards[i]=sc.nextInt();
        }
        int[] cnt = new int[cards.length];
        for(int i = 0; i < cards.length; i++){
            cnt[cards[i]]++;
        }

        int i = 0;

        while(i < cards.length){
            if(cnt[i]>=3){
                cnt[i]-=3;
                System.out.println("triplet");
                continue;
            }
            if(cnt[i]>=1 && cnt[i+1] >= 1 && cnt[i+2] >=1){
                cnt[i]--;
                cnt[i+1]--;
                cnt[i+2]--;
                System.out.println("run");
                continue;
            }
            i++;
        }
    }
}
