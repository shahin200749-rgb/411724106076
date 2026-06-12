public class june11 {
    public static void main(String[] args) {

        double amount = 900;
        int years = 3;
        double rate = 0;

    if(amount <= 10000 && years >=5){
        rate = 10;
        } 
        else if (amount<=10000 && years>=3){
            rate = 5;
        }
        else if (amount<=10000 && years>=1){
            rate = 3;
        }
        else{
            System.out.println("invalid fd period");
            return;
        }
            System.out.println("Initial Amount = " + amount);

            for (int i = 1; i <= years; i++) {
                amount = amount + (amount * rate / 100);
                System.out.println("Amount after Year " + i + " = " + amount);
            }
        }
    }
 
    

