import java.util.HashSet;
import java.util.Random;

public class ex17 {
    public static void main(String[] args) {
        Random r = new Random();
        HashSet set = new HashSet();
        while(set.size() < 6){
            int data = r.nextInt(45)+1;
            System.out.println("랜덤 값 : "+data);
            set.add(data);
        }
        System.out.println(set);
    }
}
