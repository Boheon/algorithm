import java.util.ArrayList;
import java.util.HashSet;

public class ex11 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("홍길동");
        list.add("홍길동");
        list.add("홍길동");
        list.add(100);
        list.add(11.22);
        list.add('남');
        list.add(true);

        HashSet list2 = new HashSet();
        for(int i = 0; i < list.size(); i++){
            list2.add(list.get(i));
        }
    }
}
