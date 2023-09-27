import java.util.ArrayList;
import java.util.LinkedList;

public class ex15 {
    public static void main(String[] args) {
        LinkedList milk = new LinkedList();
        milk.add("어제 먹을 우유");
        milk.add("오늘 먹을 우유");
        milk.add("내일 먹을 우유");
        System.out.println(milk);
        milk.remove();
        System.out.println(milk);
    }
}
