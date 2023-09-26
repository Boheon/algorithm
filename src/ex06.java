public class ex06 {
    public static void main(String[] args) {
        int[] s = {90, 80, 20,60, 70};
        int min = s[0];

        for(int i = 0; i < 5; i++){
            if(min > s[i]) min = s[i];
        }
        System.out.println(min);
    }
}
