public class june12{
    public static void main (String[]args){
        String str = "shajahan";
        String str1 = "Shainaz";
        String str2 = new String("Heart");
        StringBuffer sb = new StringBuffer();
        StringBuilder sbr = new StringBuilder();

        sb.append("Shanavas");
        sbr.append("shahin");

        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(sb);
        System.out.println(sbr);

        
    }
}   

  /*   public class june12{
        public static void main(String[]args){
            String str1 = "love";
            String str2 = "evol";
            System.out.println(str1+str2);

        }
}*/
        
    
 /*  public class june12{
    public static void main(String[] args) {

        String s1 = "analog";
        String s2 = "along";

        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        int[] arr = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i) - 'a']++;
            arr[s2.charAt(i) - 'a']--;
        }

        boolean flag = true;

        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                flag = false;
                break;
            }
        }

        if (flag)
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}*/

/*public class june12 {
    public static void main(String[] args) {
        int n = 456;

        int original = n;
        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        if (original == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}*/
/*public class june12{
    public static void main(String[] args) {
        String str = "thangooo";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (str.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}*/