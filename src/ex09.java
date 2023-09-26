public class ex09 {
    public static void main(String[] args) {
        String s = " [ 10, 20, 30, 40, 50 ]";
        s=s.replace("[","");
        s=s.replace("]", "");
        System.out.println(s);

        s = s.trim();
        System.out.println(s);

        String[] nums = s.split(", ");
        int sum = 0;
        for(int i = 0 ; i < nums.length; i++){
            sum += Integer.parseInt(nums[i]);
        }
        System.out.println(sum);

        int[] nums2 = new int[5];

        for(int i = 0; i<nums2.length;i++){
            nums2[i] = Integer.parseInt(nums[i]);
            System.out.println(nums2[i]);
        }

    }
}
