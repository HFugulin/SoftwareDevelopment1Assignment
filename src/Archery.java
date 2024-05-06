// Hanna Melo Fugulin, COP 3330C: Object-Oriented Programming - CRN 24680, January 10th 2024
// Program Objective: develop a simple program using Object-oriented programming, implement a program using classes and objects.

// Class: Archery
// Represents Archery as a sport. Defines details on bow usage, number of arrows, and range distance (m).
// It takes in BowUsed as a String, ArrowsShot as an int, and Distance as a double.
public class Archery {
    // Attributes - privated, datatype, and name, in that order.
    private String BowUsed;
    private int ArrowsShot;
    private double Distance;

    // Constructor
    // Takes in BowUsed, ArrowsShot, and Distance. "this" keyword assigns values.
    public Archery (String BowUsed, int ArrowsShot, double Distance){
        this.BowUsed = BowUsed;
        this.ArrowsShot = ArrowsShot;
        this.Distance = Distance;
    }
    // Overloaded Constructor - Sets all values to null or zero.
    public Archery(){
        this.BowUsed = "";
        this.ArrowsShot = 0;
        this.Distance = 0.0;
    }
    // Get and Set Methods - Accesses/Changes values stored
    public String getBowUsed(){
        return BowUsed;
    }
    public void setBowUsed (String BowUsed){
        this.BowUsed = BowUsed;
    }
    public int getArrowsShot(){
        return ArrowsShot;
    }
    public void setArrowsShot (int ArrowsShot){
        this.ArrowsShot = ArrowsShot;
    }
    public double getDistance(){
        return Distance;
    }
    public void setDistance(double Distance) {
        this.Distance = Distance;
    }
    // Custom Method: counts the total arrow usage with a specific bow and updates the arrow count.
    public void TotalArrowUse(int ArrowUse) {
        this.ArrowsShot += ArrowUse;
    }
    // Print Method - Will print out all the details for this class (what bow was used, how many arrows were shot, and the range distance).
    public void printDetails() {
        System.out.println("Bow Used: " + BowUsed + "\nArrows Shot: " + ArrowsShot + "\nRange Distance (m): " + Distance);
    }
}
