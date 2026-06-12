public class arrayprogram {
    public static void main(String[] args) {
        int price = 800;
        int distance = 4;

        if (price > 1000) {
            System.out.println("Free Delivery");
        }
        else if (price > 500 && distance <= 5) {
            System.out.println("Free Delivery");
        }
        else if (price > 500 && distance >= 5) {
            System.out.println("Delivery Charge = Rs.100");
        }
        else if (price > 500 && distance > 10) {
            System.out.println("No Delivery Available");
        }
        else {
            System.out.println("Order Accepted");
        }
    }
}