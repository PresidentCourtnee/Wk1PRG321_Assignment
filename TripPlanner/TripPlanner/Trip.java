import java.util.Scanner;
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
    
    // initialise instance variables for distance, distance traveled, total cost per gallon as well as #ofGals used. 
        private String destination;
        private double distance;
        private double costOGas;
        private double gasUsed;
        private double MPG;
        private double costPGal;
         
        public void tripInputs()
        {
            Scanner scan = new Scanner(System.in);
            
            System.out.println("Enter your Destination: ");
            destination = scan.next();
             
            System.out.println("Enter the distance you will be traveling: ");
            distance = scan.nextDouble();
            
            System.out.println("Please enter the cost per gallong of gas: ");
            costOGas = scan.nextDouble();
            
            System.out.println("Please enter the number of gallons used: ");
            gasUsed = scan.nextDouble();
                      
            
        }
        //Calculation for the MPG
        public double getMPG()
        {
            MPG = distance/gasUsed;
            return MPG;
        }
        //Calcuation to determine the cost per gallon
        public double getcostPGal()
        {
            costPGal = distance/MPG*costOGas;
            return costPGal;
        }
        //setting MPG
        public double setMPG(double MPG)
        {
            this.MPG = MPG;
            return MPG;
        }
        //setting the Cost per Gallon
        public double setcostPGal(double costPGal)
        {
            this.costPGal = costPGal;
            return costPGal;
        }
        //setting the distance
        public double distance(double distance)
        {
            this.distance = distance;
            return distance;
        }
        //overide ToString() method
        @ Override 
            public String toString()
            {
            return  "Your miles per gallon = " +getMPG() + 
            "The toatl cost per gallon will be: "+getcostPGal();
        
            }   
    
}


