import java.util.Arrays;
import java.util.Random;

public class ex07 {
    public static void main(String[] args) {
        int[] s = new int[1000];

        Random r = new Random();

        for(int i = 0; i < s.length; i++){
            s[i] = r.nextInt(999)+1;
        }

        System.out.println(Arrays.toString(s));

        int min = s[0];
        int max = s[0];
        for( int x : s){
            if(x < min) min = x;
            if(x > max) max = x;
        }
        System.out.println("최소값 >> " + min);
        System.out.println("최댓값 >> " + max);
    }
}
