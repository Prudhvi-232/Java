import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class TicketMachine {
    private int balance = 0;
    private int totalRevenue = 0;

    public int getBalance() {
        return balance;
    }

    public int getTotalRevenue() {
        return totalRevenue;
    }

    public void insertMoney(int amount) {
        balance += amount;
    }

    public void refundBalance(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            balance = 0;
        }
    }

    public void updateTotalRevenue(int amount) {
        totalRevenue += amount;
    }
}

class MovieTicket {
    private String movieName;
    private String date;
    private String time;
    private String seatType;
    private int price;
    private String qrCode;

    public MovieTicket(String movieName, String date, String time, String seatType, int price, String qrCode) {
        this.movieName = movieName;
        this.date = date;
        this.time = time;
        this.seatType = seatType;
        this.price = price;
        this.qrCode = qrCode;
    }

    public String toString() {
        return "Movie: " + movieName + "\nDate: " + date + "\nTime: " + time + "\nSeat Type: " + seatType + "\nPrice: " + price + "\nQR Code: " + qrCode;
    }

    public int getPrice() {
        return price;
    }
}

class TicketingSystem {
    private static Map<String, Map<String, Integer>> movieSeatPrices = new HashMap<>();
    private static TicketMachine ticketMachine = new TicketMachine();
    static {
        Map<String, Integer> seatPrices = new HashMap<>();
        seatPrices.put("Silver", 120);
        seatPrices.put("Gold", 150);
        seatPrices.put("Platinum", 220);
    
        movieSeatPrices.put("Inception", seatPrices);
        movieSeatPrices.put("Joker", seatPrices);
        movieSeatPrices.put("Avatar 2", seatPrices);
    
    }
    public static void displayMovies() {
        System.out.println("Movies:");
        int option = 1;
        for (String movie : movieSeatPrices.keySet()) {
            System.out.println(option++ + ". " + movie);
        }
    }

    public static void displaySeatTypes() {
        System.out.println("Seat Types:");
        int option = 1;
        for (String seatType : movieSeatPrices.get("Inception").keySet()) {
            System.out.println(option++ + ". " + seatType + " - Price: " + movieSeatPrices.get("Inception").get(seatType));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        displayMovies();

        System.out.print("Select a movie (Enter the corresponding number): ");
        int selectedMovieOption = scanner.nextInt();

        if (selectedMovieOption < 1 || selectedMovieOption > movieSeatPrices.size()) {
            System.out.println("Invalid option. Exiting program.");
            System.exit(1);
        }

        String selectedMovie = (String) movieSeatPrices.keySet().toArray()[selectedMovieOption - 1];

        displaySeatTypes();

        System.out.print("Select seat type (Enter the corresponding number): ");
        int selectedSeatOption = scanner.nextInt();

        if (selectedSeatOption < 1 || selectedSeatOption > movieSeatPrices.get(selectedMovie).size()) {
            System.out.println("Invalid option. Exiting program.");
            System.exit(1);
        }

        String selectedSeatType = (String) movieSeatPrices.get(selectedMovie).keySet().toArray()[selectedSeatOption - 1];

        System.out.print("Enter number of tickets for " + selectedSeatType + " seats: ");
        int numTickets = scanner.nextInt();

        int totalPrice = movieSeatPrices.get(selectedMovie).get(selectedSeatType) * numTickets;
        System.out.println("Total Price: " + totalPrice);

        System.out.print("Insert money: ");
        int insertedMoney = scanner.nextInt();
        ticketMachine.insertMoney(insertedMoney);

        System.out.println("Balance: " + ticketMachine.getBalance());

        MovieTicket movieTicket = new MovieTicket(selectedMovie, "2024-01-24", "18:00", selectedSeatType, totalPrice, "ABC123");
        System.out.println("\nTicket Details:\n" + movieTicket);

        if (ticketMachine.getBalance() >= totalPrice) {
            ticketMachine.refundBalance(totalPrice);
            ticketMachine.updateTotalRevenue(totalPrice);
            System.out.println("Payment Processed. Remaining Balance: " + ticketMachine.getBalance());
        } else {
            System.out.println("Insufficient funds. Exiting program.");
            System.exit(1);
        }

        System.out.println("Total Revenue: " + ticketMachine.getTotalRevenue());

        scanner.close();
    }
}