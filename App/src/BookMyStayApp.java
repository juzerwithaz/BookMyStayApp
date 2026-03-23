/**
 * ==============================================================
 * MAIN CLASS – UseCase1HotelBookingApp
 * ==============================================================
 *
 * Use Case 1: Application Entry & Welcome Message
 *
 * Description:
 * This class represents the entry point of the
 * Hotel Booking Management System.
 *
 * At this stage, the application:
 * - Starts execution from the main() method
 * - Displays a welcome message to the user
 * - Confirms that the system has started successfully
 *
 * No business logic, data structures, or user input
 * is implemented in this use case.
 *
 * The goal is to establish a clear and predictable
 * application startup point.
 *
 * @author Developer
 * @version 1.0
 */
public class BookMyStayApp {

    public static void main(String[] args) {

        // Use Case 1
        UseCase1 uc1 = new UseCase1();
        uc1.showWelcomeMessage();

        // Use Case 3 (Inventory)
        RoomInventory.displayAvailability();

        boolean status = RoomInventory.bookRoom("single");

        if (status) {
            System.out.println("Room booked successfully!");
        } else {
            System.out.println("Room not available!");
        }

        RoomInventory.displayAvailability();
    }
}


/**
 * ==============================================================
 * SUB CLASS – UseCase1
 * ==============================================================
 *
 * Use Case 1: Application Entry & Welcome Message
 */

class UseCase1 {

    /**
     * Method to display welcome message
     */
    public void showWelcomeMessage() {

        System.out.println("=======================================");
        System.out.println("     Welcome to BookMyStay App");
        System.out.println("=======================================");
        System.out.println("Application has started successfully!");
        System.out.println("Please proceed to login...");
        System.out.println("=======================================");
    }
}
/**
 * ==============================================================
 * ABSTRACT CLASS – Room
 * ==============================================================
 *
 * Use Case 2: Basic Room Types & Static Availability
 *
 * Description:
 * This abstract class represents a generic hotel room.
 *
 * It models attributes that are intrinsic to a room type
 * and remain constant regardless of availability.
 *
 * Inventory-related concerns are intentionally excluded.
 *
 * @version 2.1
 */
abstract class Room {

    /** Number of beds available in the room */
    protected int numberOfBeds;

    /** Total size of the room in square feet */
    protected int squareFeet;

    /** Price charged per night for this room type */
    protected double pricePerNight;

    /**
     * Constructor used by child classes to initialize
     * common room attributes.
     *
     * @param numberOfBeds number of beds in the room
     * @param squareFeet total room size
     * @param pricePerNight cost per night
     */
    public Room(int numberOfBeds, int squareFeet, double pricePerNight) {
        this.numberOfBeds = numberOfBeds;
        this.squareFeet = squareFeet;
        this.pricePerNight = pricePerNight;
    }

    /**
     * Displays room details
     */
    public void displayRoomDetails() {
        System.out.println("Number of Beds: " + numberOfBeds);
        System.out.println("Room Size: " + squareFeet + " sq.ft");
        System.out.println("Price per Night: Rs. " + pricePerNight);
    }
}
/**
 * ==============================================================
 * CLASS – RoomInventory
 * ==============================================================
 *
 * Use Case 3: Centralized Room Inventory Management
 *
 * Description:
 * This class manages the availability of different room types
 * in a centralized manner.
 *
 * It keeps track of how many rooms are available and allows
 * booking by reducing the count.
 *
 * @version 3.0
 */
class RoomInventory {

    private static int singleRoomCount = 5;
    private static int doubleRoomCount = 3;
    private static int deluxeRoomCount = 2;

    public static void displayAvailability() {

        System.out.println("\n===== Room Availability =====");
        System.out.println("Single Rooms: " + singleRoomCount);
        System.out.println("Double Rooms: " + doubleRoomCount);
        System.out.println("Deluxe Rooms: " + deluxeRoomCount);
        System.out.println("=============================");
    }

    public static boolean bookRoom(String roomType) {

        if (roomType.equalsIgnoreCase("single")) {
            if (singleRoomCount > 0) {
                singleRoomCount--;
                return true;
            }
        }

        else if (roomType.equalsIgnoreCase("double")) {
            if (doubleRoomCount > 0) {
                doubleRoomCount--;
                return true;
            }
        }

        else if (roomType.equalsIgnoreCase("deluxe")) {
            if (deluxeRoomCount > 0) {
                deluxeRoomCount--;
                return true;
            }
        }

        return false;
    }
}