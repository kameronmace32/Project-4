import java.util.Scanner;
public class HotelOccupancy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of floors:");
        int rooms = 0, roomsOcc =0, totalRooms = 0, totalOcc = 0, totalVac = 0, roomsVac = 0;
        int floors = scanner.nextInt();
        for(int i= 1; i <= floors; i++){
            System.out.printf("How many rooms on floor %d:", i);
            rooms =scanner.nextInt();
            System.out.println("How many of the floor's rooms are occupied?");
            roomsOcc = scanner.nextInt();


            totalRooms += rooms;
            totalOcc += roomsOcc;
    }
        System.out.printf("Floors: %d", floors);

        System.out.printf("\nRooms: %d", totalRooms);

        System.out.printf("\nOccupied Rooms %d", totalOcc);

        totalVac = totalRooms - totalOcc;

        System.out.printf("\nVacant rooms: %d", totalVac);

        double occupancyRate = (double) (totalOcc)/totalRooms;

        System.out.printf("\nOccupancy: %.2f", occupancyRate);
    }
}
