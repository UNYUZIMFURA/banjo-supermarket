import java.util.Scanner;
import java.util.Arrays;

public class Main {
        public static void main (String[]args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("######## Welcome to Banjo Supermarket ########");
            System.out.print("Register your name: ");
            String username = scanner.nextLine().trim();
            System.out.print("Deposit Money in our system [Greater than 65$]: ");
            int deposit = scanner.nextInt();
            if(deposit < 65) {
                System.out.println("Deposit an amount greater than 65$");
                System.exit(0);
            }
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
            System.out.println("Buy Product(s) by choosing its/their number! ");
            System.out.println("");
            int arr[] = new int[productNumber];
            for (int i = 1; i <= productNumber; i++) {
                System.out.print("Enter product " + i + ":");
                arr[i-1] = scanner.nextInt();
            }
            int productsAmount = 0;
            String chosenProducts[] = new String[productNumber];
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == 1) {
                    if(chosenProducts.length == 0 ){
                        productsAmount += 30;
                        chosenProducts[0] = "Fried Chips";
                    }

                    else {
                        productsAmount += 30;
                        chosenProducts[i] = "Fried Chips";
                    }
                }

                else if(arr[i] == 2) {
                    if(chosenProducts.length == 0 ){
                        productsAmount += 20;
                        chosenProducts[0] = "Mutziig";
                    }

                    else {
                        productsAmount += 20;
                        chosenProducts[i] = "Mutziig";
                    }
                }

                else if (arr[i] == 3) {
                    if(chosenProducts.length == 0 ){
                        productsAmount += 5;
                        chosenProducts[0] = "Ice cream";
                    }

                    else {
                        productsAmount += 5;
                        chosenProducts[i] = "Ice cream";
                    }
                }

                else if (arr[i] == 4) {
                    if(chosenProducts.length == 0 ){
                        productsAmount += 4;
                        chosenProducts[0] = "Pizza";
                    }

                    else {
                        productsAmount += 4;
                        chosenProducts[i] = "Pizza";
                    }
                }

                else if (arr[i] == 5) {
                    if(chosenProducts.length == 0 ){
                        productsAmount += 3;
                        chosenProducts[0] = "Yoghurt";
                    }

                    else {
                        productsAmount += 3;
                        chosenProducts[i] = "Yoghurt";
                    }
                }

                else if (arr[i] == 6) {
                    if(chosenProducts.length == 0 ){
                        productsAmount += 5;
                        chosenProducts[0] = "Bread";
                    }

                    else {
                        productsAmount += 5;
                        chosenProducts[i] = "Bread";
                    }
                } else {
                    productsAmount += 0;
                    chosenProducts[i] = "";
                }
            }
            int balance = deposit - productsAmount;
            System.out.println("");
            System.out.println("##### Banjo Supermarket Invoice #####");
            System.out.println("");
            System.out.println("Client Name: " + username);
            System.out.println("Products Bought: " + Arrays.toString(chosenProducts));
            System.out.println("Amount to pay: " + productsAmount + "$") ;
            System.out.println("New balance: " + balance + "$");
            System.out.println("");
            System.out.println("##### Thanks for purchasing using Banjo Supermarket, Come again!! #####");
        }
}

// Project Ended ~ Feel free to contribute!