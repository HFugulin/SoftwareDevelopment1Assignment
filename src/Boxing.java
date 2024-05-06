// Hanna Melo Fugulin, COP 3330C: Object-Oriented Programming - CRN 24680, January 10th 2024
// Program Objective: develop a simple program using Object-oriented programming, implement a program using classes and objects.

// Class: Boxing
// Represents Boxing as a sport. Defines details on weight classes, boxing styles, and match length (min).
// It takes in Weight Class and Boxing Style as strings and Match Length as a double.
public class Boxing {
    // Attributes - privated, datatype, and name, in that order.
    private String WeightClass;
    private String BoxingStyle;
    private double MatchLength;

    // Constructor
    // Takes in WeightClass, BoxingStyle, and MatchLength. "this" keyword assigns values.
    public Boxing (String WeightClass, String BoxingStyle, double MatchLength){
        this.WeightClass = WeightClass;
        this.BoxingStyle = BoxingStyle;
        this.MatchLength = MatchLength;
    }
    // Overloaded Constructor - Sets all values to null or zero.
    public Boxing(){
        this.WeightClass = "";
        this.BoxingStyle = "";
        this.MatchLength = 0.0;
    }
    // Get and Set Methods - Accesses/Changes values stored
    public String getWeightClass(){
        return WeightClass;
    }
    public void setWeightClass (String WeightClass){
        this.WeightClass = WeightClass;
    }
    public String getBoxingStyle(){
        return BoxingStyle;
    }
    public void setBoxingStyle (String BoxingStyle){
        this.BoxingStyle = BoxingStyle;
    }
    public double getMatchLength() {
        return MatchLength;
    }
    public void setMatchLength(double matchLength) {
        MatchLength = matchLength;
    }
    // Custom method: counts the total match length for a specific boxing style
    public void TotalMatchLength(double SumMatchLength) {
    this.MatchLength += SumMatchLength;
    }
    // Print Method - Will print out all the details for this class (what the weight class is, what boxing style was used, and the length of the match).
    public void printDetails() {
        System.out.println("Weight Class: " + WeightClass + "\nBoxing Style: " + BoxingStyle + "\nMatch Length (min): " + MatchLength);
    }
}
