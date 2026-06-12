//import java.util.Arrays;

//public class June09 {
    
//public static void main(String[] args) {
  //  int [] arr =  new int[] {1,2,3,4,5,6,7,8,9};
   // System.out.println(arr[0]);
   // arr[1] = 200;
   // arr[2]++;
   // System.out.println(Arrays.toString(arr));
//}
//}

import java.util.Scanner;

public class June09 {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Grade A");
        } 
        else if (marks >= 80) {
            System.out.println("Grade B");
        } 
        else if (marks >= 70) {
            System.out.println("Grade C");
        } 
        else if (marks >= 60) {
            System.out.println("Grade D");
        } 
        else {
            System.out.println("Fail");
        }

        sc.close();
    }
}