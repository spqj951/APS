import java.util.Scanner;

public class BabyGin_BrutalForce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] cards = new int[6];
        int N = cards.length;
        for(int i = 0; i < N; i++){
            cards[i] = sc.nextInt();

        }//숫자 입력 끝

        for(int i = 0; i < N; i++) {//첫 번째 카드
            for (int j = 0; j < N; j++) {//두 번째 카드
                if (i != j) {//같은 카드 중복 x
                    for (int k = 0; k < N; k++) {
                        if (k != i && k != j) {
                            System.out.printf("%d %d %d\n", cards[i], cards[j], cards[k]);
                            if(runCheck(cards[i], cards[j], cards[k])){
                                System.out.println("These cards are 'run!'");
                                System.out.println("-----------------------");
                            }
                            if(tripletCheck(cards[i], cards[j], cards[k])){
                                System.out.println("These cards are 'Triplet!'");
                            }
                        }
                    }
                }
            }
        }//for 문 끝
    }//main

    static boolean runCheck(int a, int b, int c){
        return b == a+1 && c == a+2;
    }
    static boolean tripletCheck(int a, int b, int c){
        return a == b && a == c;
    }
}
