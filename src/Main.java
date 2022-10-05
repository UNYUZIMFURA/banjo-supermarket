import java.util.Scanner;

public class Main {
        public static void main (String[]args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("######## Welcome to Banjo Supermarket ########");
            System.out.print("Register your name: ");
            String username = scanner.nextLine().trim();
            System.out.print("Deposit Money in our system: ");
            int initialAmount = scanner.nextInt();
            System.out.println("");
            System.out.println("-------- List of products --------");
            System.out.println("1.Fried Chips: $30\n2.Mutziig: $20\n3.Ice cream: $5\n4.Pizza: $4\n5.Yoghurt: $3\n6.Bread: $2\n");
            System.out.println("How many products do you want to buy? ");
            int productNumber = scanner.nextInt();
            System.out.println("Buy Product(s) by choosing its/their number!: ");
            scanner.close();
            // Testing jere
            for (int i = 1; i <= productNumber; i++) {
                System.out.println("Enter product " + i);
            }
        }
}
