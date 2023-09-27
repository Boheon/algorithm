import java.lang.reflect.Array;
import java.util.ArrayList;

public class ex14 {
    public static void main(String[] args) {
        ArrayList ski = new ArrayList();
        ski.add("박스키");
        ski.add("송스키");
        ski.add("김스키");
        ski.add("정스키");
        System.out.println(ski);
        ski.remove(1);
        System.out.println(ski);

        for(int i = 0; i < ski.size(); i++){
            System.out.println((i+1) + "등 : "+ski.get(i));
        }
        System.out.println(ski.contains("김연아"));
        System.out.println(ski.size());

        ArrayList list2 = new ArrayList();
        list2.add("이스키");
        list2.add("박스키");
        list2.add("앵스키");
        ski.addAll(list2);
        System.out.println(ski);

        System.out.println(list2.isEmpty());
        list2.clear();
        System.out.println(list2);

    }

}
