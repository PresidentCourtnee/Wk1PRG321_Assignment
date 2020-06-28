import java.lang.String;
/**
 * Project: Week 1 Assignment Answer to Question #1
 * Class PRG321
 * Instructor: Jerrie Pineda
  * @author (Courtnee)
 * @version (6-26-2020)
 * This is my Trip class and is the requested main class for the assignment
 * and provides the behaviors
 */
public class Trip
{
    
    // initialise instance variables
         String s = "Destination";
         double totalMiles; 
         double pricePerGallon; 
         double totalGallons;
         double milesPerGal;
         double costPerMile;
         
    public static void main(String args[])
    {
         StringBuilder builder = new StringBuilder("Destination");
         builder.append("Utah");
         return builder.toString();
    }

    //method to calculate miles per gallon
    public double calculateMpg()
    {
        double milesPerGal;
        milesPerGal = totalMiles / totalGallons;
        return milesPerGal;//return
    }
    //method to calculatetotal gas cost
    public double calculateTrip()
    {
        double costPerMile;
        costPerMile = pricePerGallon * totalGallons;
        return costPerMile;
    }
    //method to calculate cost per mile
    public double calculateCost()
    {
        double costPerMile;
        costPerMile = calculateTrip() / totalMiles;
        return costPerMile;
    }
    public String Destination()
    {   this.s = "Destination";
    }
    //overide ToString() method
    @ Override 
    //return details
        public String toString(){
        return "Miles Per Gallon: " + milesPerGal + 
        "Cost per mile: "+ costPerMile + "Destination: "+ String.toString("Utah");}
    
}


