import java.util.LinkedList;
import java.util.Queue;

public class ex16 {
    public static void main(String[] args) {
        Queue queue=new LinkedList();
        queue.offer("국어");
        queue.offer("수학");
        queue.offer("영어");
        queue.offer("컴퓨터");

        System.out.println("전체 시험볼 과목 : "+queue);

        for(int i = 0; !queue.isEmpty(); i++){
            System.out.println(queue.size());
            System.out.println(queue.poll());


            System.out.println(i+1+"일차: 시험 본 후 남은 과목 "+ queue);
        }
    }
}
