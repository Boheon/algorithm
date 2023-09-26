import java.awt.*;
import java.util.Random;

public class ex08 {
    public static void main(String[] args) {
        int[] score = new int[1000];
        Random r = new Random(33);
        for (int i = 0; i < score.length; i++) {
            score[i] = r.nextInt(1000);
        }

        int max = score[0];
        for (int i = 0; i < score.length; i++) {
            if (max < score[i]) {
                max = score[i];
            }
        }
        System.out.println("최댓값은 " + max);

        int count = 0;
        for (int i = 0; i < score.length; i++) {
            if (score[i] == max) {
                System.out.println(max + " 의 위치값 " + i);
                count++;
            }
        }
        System.out.println("최댓값의 갯수는 "+count+"개");
    }
}
