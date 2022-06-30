public class PowerSet_Recursion {
    public static void main(String[] args) {
        sel = new boolean[4];
        powerSet(0);
    }
    public static boolean[] sel;
    public static String[] material = {"단무지", "당근", "참치", "햄"};
    public static void powerSet(int idx){
        if(idx == sel.length){
            for(int i =0; i <sel.length; i++){
                if(sel[i]){
                    System.out.print(material[i]);
                }
            }
            System.out.println(" 김밥");
            return;
        }
        sel[idx] =true;
        powerSet(idx+1);
        sel[idx] = false;
        powerSet(idx+1);

    }
}
