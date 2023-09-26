import java.util.Random;

public class ex03 {
    public static void main(String[] args) {
        Random r = new Random(100);
        int[] numbers = new int[1000];

        for(int i = 0; i < numbers.length;i++){
            numbers[i] = r.nextInt(101);
        }

        for(int i = 0; i < numbers.length; i++){
            System.out.println(i + ": "+numbers[i]);
        }
    }
}
