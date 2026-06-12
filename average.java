public class average {
    public static void main (String[]args){
        int[] arr = new int[]{10,20,30,40,50,60};
        int sum = 0;
        for(int i=0; i < arr.length; i++){
            sum = sum +arr[i];
        }
        double average = (double)sum/ arr.length;
        System.out.println("Average=" + average);
}
}