public class june10 {
 
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40, 50};
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if(sum == 150) {
            sum = 150/5;
            System.out.println(sum);
        } 
    }
}


