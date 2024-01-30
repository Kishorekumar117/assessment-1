package Changepond;

import java.util.*;

class TicketManager {
    private static final int maxConformTickets = 10;

    private Queue<String> confirmedTickets = new LinkedList<>();
    private Queue<String> waitingList = new LinkedList<>();
    private List<String> bookedNames = new ArrayList<>();
    private List<String> employees = Arrays.asList(
            "Kishore", "Kumar", "Subramani", "Bala", "Dola", "Ram", "Som",
            "Sam", "Vasanth", "Gowtham", "Dinesh", "Naveen", "Rajesh", "Sundhar", "Madhu"
    );

    public void bookTicket(String name) {
    	
        if (employees.contains(name)) {
            if (!bookedNames.contains(name)) {
                if (confirmedTickets.size() < maxConformTickets) {
                    System.out.println("your ticket is confirmed");
                    confirmedTickets.offer(name);
                } else {
                    System.out.println(" your ticket is in Waiting");
                    waitingList.offer(name);
                }
                bookedNames.add(name);
            } else {
                System.out.println("You have alreay ticket.");
            }
        } else {
            System.out.println("please enter correct name");
        }
    }

    public void displayConfirmedTickets() {
        if (!confirmedTickets.isEmpty()) {
            int i = 1;
            System.out.println("\nTicket No     Names");
            for (String name : confirmedTickets) {
                System.out.println("   " + i + "   " + name);
                i++;
            }
        } else {
            System.out.println("available tickets");
        }
    }

    public void displayWaitingList() {
        if (!waitingList.isEmpty()) {
            System.out.println("\n Names");
            for (String name : waitingList) {
                System.out.println(" " + name);
            }
        } else {
            System.out.println("No waiting list.");
        }
    }

    public boolean cancelTicket(String name) {
        if (confirmedTickets.contains(name)) {
            confirmedTickets.remove(name);
            bookedNames.remove(name);
            System.out.println("Ticket canceled.");

            if (confirmedTickets.size() < maxConformTickets && !waitingList.isEmpty()) {
                confirmedTickets.offer(waitingList.poll());
            }
            return true;
        } else {
            System.out.println("Ticket not found for this name");
            return false;
        }
    }
}

public class TicketForForeignTrip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TicketManager ticketManager = new TicketManager();

        while (true) {
            displayMenu();

            int choice = getUserChoice(input);

            switch (choice) {
                case 1:
                    bookTicket(input, ticketManager);
                    break;
                case 2:
                    ticketManager.displayConfirmedTickets();
                    break;
                case 3:
                    ticketManager.displayWaitingList();
                    break;
                case 4:
                    cancelTicket(input, ticketManager);
                    break;
                case 5:
                    System.out.println("Exit...");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid number between 1 and 5.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\nTICKET BOOKING CHANGEPOND");
        System.out.println("1. Book Ticket ");
        System.out.println("2. Confirm Ticket ");
        System.out.println("3. Waiting Ticket ");
        System.out.println("4. Cancel Ticket ");
        System.out.println("5. Exit ");
        System.out.print("Enter your Choice: ");
    }

    private static int getUserChoice(Scanner input) {
        int choice;
        try {
            choice = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            input.nextLine(); // Clear the invalid input from the scanner
            return -1;
        }
        return choice;
    }

    private static void bookTicket(Scanner input, TicketManager ticketManager) {
        try {
            System.out.print("Your Name : ");
            String name = input.next();
            ticketManager.bookTicket(name);
        } catch (Exception e) {
            System.out.println("Invalid input");
            input.next(); // Clear the invalid input from the scanner
        }
    }

    private static void cancelTicket(Scanner input, TicketManager ticketManager) {
        try {
            System.out.print("Your Name : ");
            String name = input.next();
            ticketManager.cancelTicket(name);
        } catch (Exception e) {
            System.out.println(" Please enter correct name .");
            input.next();
        }
    }
}
