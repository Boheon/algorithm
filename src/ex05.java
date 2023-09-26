import java.util.*;

public class ex05 {
    public static void main(String[] args) {
        double[] numbers = {11.1, 22.2, 22.2, 55.5, 22.2, 11.1, 40.2};

        HashMap<Double, Integer> map = new HashMap<>();

        for(double n : numbers){
            Integer count = map.get(n);
            if(count == null){
                map.put(n,1);
            }else{
                map.put(n, count+1);
            }
        }

        for(double n : map.keySet()){
            System.out.println(n + " : " + map.get(n));
        }
    }
}
