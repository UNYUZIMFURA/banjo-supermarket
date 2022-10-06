import java.util.Scanner;
import java.util.Arrays;

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
            System.out.println("1.Fried Chips: $30");
            System.out.println("2.Mutziig: $20");
            System.out.println("3.Ice cream: $5");
            System.out.println("4.Pizza: $4");
            System.out.println("5.Yoghurt: $3");
            System.out.println("6.Bread: $2");
            System.out.println("");
            System.out.print("How many products do you want to buy? ");
            int productNumber = scanner.nextInt();
            System.out.println("Buy Product(s) by choosing its/their number!: ");
            int arr[] = new int[productNumber];
            for (int i = 1; i <= productNumber; i++) {
                System.out.print("Enter product " + i);
                arr[i-1] = scanner.nextInt();
            }
            String chosenProducts[] = new String[productNumber];
            System.out.println(chosenProducts.length);

            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == 1) {
                    if(chosenProducts.length == 0 ){
                        chosenProducts[0] = "Fried Chips";
                    }

                  chosenProducts[chosenProducts.length + 1] = "Fried Chips";
                }

                else if(arr[i] == 2) {
                    if(chosenProducts.length == 0 ){
                        chosenProducts[0] = "Fried Chips";
                    }

                    chosenProducts[chosenProducts.length + 1] = "Mutziig";
                }

                else if (arr[i] == 3) {
                    if(chosenProducts.length == 0 ){
                        chosenProducts[0] = "Fried Chips";
                    }

                    chosenProducts[chosenProducts.length + 1] = "Ice cream";
                }

                else if (arr[i] == 4) {
                    if(chosenProducts.length == 0 ){
                        chosenProducts[0] = "Fried Chips";
                    }

                    chosenProducts[chosenProducts.length + 1] = "Pizza";
                }

                else if (arr[i] == 5) {
                    if(chosenProducts.length == 0 ){
                        chosenProducts[0] = "Fried Chips";
                    }

                    chosenProducts[chosenProducts.length + 1] = "Yoghurt";
                }

                else if (arr[i] == 6) {
                    if(chosenProducts.length == 0 ){
                        chosenProducts[0] = "Fried Chips";
                    }

                    chosenProducts[chosenProducts.length - productNumber] = "Bread";
                }
            }
           System.out.println("You have chosen "+ Arrays.toString(chosenProducts));
        }
}