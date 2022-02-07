import java.util.Scanner;

public class Money_Exchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = 23000;
        int usd;
        System.out.println("Enter amount to be exchanged to VND");
        usd = scanner.nextInt();
        int vnd = usd * rate;
        System.out.println(vnd + " VND" );
    }
}
