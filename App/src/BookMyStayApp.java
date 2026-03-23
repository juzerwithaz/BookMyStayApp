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

        // Calling Use Case 1
        UseCase1 uc1 = new UseCase1();
        uc1.showWelcomeMessage();
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
