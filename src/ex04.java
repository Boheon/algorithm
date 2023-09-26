import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] array = new double[5];

        int count = 0;

        for(int i = 0; i < 5; i++){

            array[i] = scan.nextDouble();

            if(array[i] == 22.2){
                count++;
            }
        }

        for(int i = 0; i < 5; i++){
            System.out.println(array[i]);
        }

        System.out.println("22.2의 갯수는 " + count);
    }
}
