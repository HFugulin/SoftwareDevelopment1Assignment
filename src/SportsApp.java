// Hanna Melo Fugulin, COP 3330C: Object-Oriented Programming - CRN 24680, January 10th 2024
// Program Objective: develop a simple program using Object-oriented programming, implement a program using classes and objects.

// Class: SportsApp
// Main class to demonstrate the creation and use of objects, as well as print it.

public class SportsApp {
    public static void main(String [] args) {
        // Instantiating the Objects, assigning attributes for each object.

        Archery bow = new Archery("Longbow", 10, 50.0);
        // Expected output of "Longbow" as Bow Used, 10 as the number of arrows shot, and 50 as the range distance.

        Boxing box = new Boxing("Lightweight", "Orthodox", 15.0);
        // Expected output of "Lightweight" as the weight class, "orthodox" as the boxing style, and 15 for the match length.

        // Printing out details of the just-defined data, before manipulation.
        bow.printDetails();
        box.printDetails();

        // Using Methods
        bow.TotalArrowUse(5);
        box.TotalMatchLength(5.0);

        // Printing out updated details
        System.out.println("Total arrows shot: " + bow.getArrowsShot());
        // Total arrows shot should output: 15
        System.out.println("Total match length (min): " + box.getMatchLength());
        // Updated match length should output: 20.0
    }
}
