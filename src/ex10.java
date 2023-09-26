import java.util.Scanner;

public class ex10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("일, 월, 화 날씨를 순서대로 입력하시오.==");
        String data = sc.next();
        String[] data2 = data.split(",");
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < data2.length;i++){
            if(data2[i].equals("흐림")){
                count1++;
            }else{
                count2++;
            }
        }
        System.out.println("흐림의 개수 "+ count1);
        System.out.println("맑음의 개수" + count2);
    }
}
