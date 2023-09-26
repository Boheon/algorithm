public class ex02 {
    public static void main(String[] args) {
        //배열확인
        int[] ages = {60, 50, 30, 20, 10};

        double[] weight = new double[5];
        weight[0] = 77.8;
        weight[1] = 45.5;
        weight[2] = 88.5;
        weight[3] = 99.5;
        weight[4] = 35.5;

        for(int i = 0; i < weight.length; i++){
            System.out.println(ages[i]+ " " + weight[i]);
        }

        for(double d : weight){
            System.out.println(d);
        }


    }



}
