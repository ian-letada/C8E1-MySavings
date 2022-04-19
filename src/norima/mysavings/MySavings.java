package norima.mysavings;

import java.util.Scanner;

public class MySavings {
    static Scanner scan = new Scanner(System.in);
    static PiggyBank bank = new PiggyBank();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        boolean exitFlag = false;

        while (!exitFlag) {
            System.out.println("[1] Show total in bank");
            System.out.println("[2] Add a penny");
            System.out.println("[3] Add a nickel");
            System.out.println("[4] Add a dime");
            System.out.println("[5] Add a quarter");
            System.out.println("[6] Take money out of bank");
            System.out.println("[0] Quit");
            System.out.print("Enter your choice: ");
            int userInput = scan.nextInt();

            switch (userInput) {
                case 1: {
                    System.out.println(bank.getSavings());
                    break;
                }
                case 2: {
                    bank.addPenny();
                    break;
                }
                case 3: {
                    bank.addNickel();
                    break;
                }
                case 4: {
                    bank.addDime();
                    break;
                }
                case 5: {
                    bank.addQuarter();
                    break;
                }
                case 6: {
                    removeCoin();
                    break;
                }
                case 0: {
                    scan.close();
                    exitFlag = true;
                    break;
                }
                default: {
                    System.out.println("Invalid input. Try again!");
                }
            }
        }
        System.exit(0);

    }

    public static void removeCoin() {
        System.out.println("[0] Go back");
        System.out.println("[1] Remove a penny");
        System.out.println("[2] Remove a nickel");
        System.out.println("[3] Remove a dime");
        System.out.println("[4] Remove a quarter");
        System.out.print("Enter your choice: ");
        int userInput = scan.nextInt();

        switch (userInput) {
            case 1: {
                bank.removePenny();
                break;
            }
            case 2: {
                bank.removeNickel();
                break;
            }
            case 3: {
                bank.removeDime();
                break;
            }
            case 4: {
                bank.removeQuarter();
                break;
            }
            case 0: {
                return;
            }
            default: {
                System.out.println("Invalid input. Try again!");
            }

        }
    }

}
