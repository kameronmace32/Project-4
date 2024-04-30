import java.util.Scanner;
import java.util.Random;

public class MovieSimulationThree {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] movieNames = {"Trainspotting", "The Croods", "Fight Club", "NightCrawler"};
        String[] movieTypes = {"2D", "3D", "2D", "3D"};
        double[] moviePrices = {30.20, 20.45, 25.99, 20.50};

        displayMovieDetails(movieNames, movieTypes, moviePrices);

        int index = selectMovie();
        System.out.printf("%s Movie Selection %s\n", "-".repeat(10), "-".repeat(10));
        displaySelectedMovie(index,movieNames, movieTypes, moviePrices);


        final int ROW = 5;
        final int COLUMN = 10;

        int[][] movieAvailability = new int[ROW][COLUMN];
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMN; j++) {
                movieAvailability[i][j] = 0;
            }
        }
        System.out.printf("\n%14sInitial Seats%14s\n", "--------------", "--------------");
        setSeatAvailability(movieAvailability, ROW, COLUMN);
        displaySeatAvailability(movieAvailability, ROW, COLUMN);
        System.out.printf("\n%14sRandomized Seats%14s\n", "--------------", "--------------");
        randomizeAvailability(movieAvailability, ROW, COLUMN);
        displaySeatAvailability(movieAvailability, ROW, COLUMN);
        selectSeats();
    }

    private static void displaySelectedMovie(int index,String[] movieName, String[] movieType, double[] moviePrice) {
        System.out.printf("Movie Selected%sMovie Type%sMovie Price\n", " ".repeat(5)," ".repeat(5));
        System.out.printf(movieName[index]+ "%s"+movieType[index]+"%s$"+moviePrice[index], " ".repeat(10)," ".repeat(10));

    }

    public static void displayMovieDetails(String[] movieNames, String[] movieTypes, double[] moviePrices) {
        System.out.printf("\n%14s Movie Details %14s", "--------------", "--------------");
        System.out.printf("\nMovie Name %10s Movie Type %5s Movie Price%5s\n", "----------", "-----", "-----");
        for (int i = 0; i < 4; i++) {
            System.out.printf("\nMovie %d:%1s", (i + 1), " ");
            System.out.printf("%s%5s", movieNames[i], "     ");
            System.out.printf("Type: %s%5s", movieTypes[i], "     ");
            System.out.printf("Price: $%.2f%5s\n", moviePrices[i], "     ");
        }
    }

    public static void setSeatAvailability(int[][] movieAvailability, final int ROW, final int COLUMN) {
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMN; j++) {
                movieAvailability[i][j] = 0;
            }
        }
    }

    public static void randomizeAvailability(int[][] movieAvailability, final int ROW, final int COLUMN) {
        Random randGen = new Random();
        for (int i = 0; i < ROW; ++i) {
            for (int j = 0; j < COLUMN; j++)
                movieAvailability[i][j] = randGen.nextInt(2);
        }
    }

    public static void displaySeatAvailability(int[][] movieAvailability, final int ROW, final int COLUMN) {

        System.out.println("Seating Availability: [1 = unavailable ; 0 = available]\n");
        char[] rowLabel = {'A', 'B', 'C', 'D', 'E'};
        for (int c = 1; c <= movieAvailability[0].length; c++) {
            System.out.printf("   %d", c);
        }
        System.out.printf("\n%s", "-".repeat(30));
        for (int i = 0; i < ROW; ++i) {
            System.out.printf("\n%c |", rowLabel[i]);
            for (int j = 0; j < COLUMN; j++) {
                System.out.printf("%4d", movieAvailability[i][j]);
                if ((j + 1) % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }

    public static int selectMovie() {
        String selectedMovie;
        System.out.println("\nEnter the movie name you are purchasing tickets for: ");
        selectedMovie = scanner.nextLine();
        while (!((selectedMovie.equalsIgnoreCase("Trainspotting")) ||
                (selectedMovie.equalsIgnoreCase("The Croods")) ||
                (selectedMovie.equalsIgnoreCase("Fight Club")) ||
                (selectedMovie.equalsIgnoreCase("Nightcrawler")))) {
            System.out.println("Error, Movie not found.");
            System.out.println("Enter the movie name you are purchasing tickets for: ");
            selectedMovie = scanner.nextLine();
        }
        if (selectedMovie.equalsIgnoreCase("trainspotting")) {
            return 0;
        } else if (selectedMovie.equalsIgnoreCase("the croods")) {
            return 1;
        } else if (selectedMovie.equalsIgnoreCase("fight club")) {
            return 2;
        } else if (selectedMovie.equalsIgnoreCase("nightcrawler")) {
            return 3;
        } else {
            System.out.println("error");
            return -1;
        }
    }
    public static int selectSeats(int[][] movieAvailability){
        System.out.println("Enter in number of tickets you want to purchase:");
        ticketsNum = scanner.nextInt();
        for (i=0; i< ticketsNum; i++){
            System.out.println("Pick an available seat for ticket "+(i+1));
            String seat = scanner.nextLine();

        }

    }
}

/*
input = ""
while
int rowIndex = seat.charAt(0) -65;
String colNum = String.valueOf(seat.charAt(1));
inr colIndex = Integer.parseIny(colNum)-1;

if seat at input = 0,available {
movieAvailability[rowIndex][colIndex] = 1;
displaySeatAvailability();

if (movieAvailability([row][col])> 0)
 */