/**
 * Project: Week 1 Assignment Answer to Question #1
 * Class PRG321
 * Instructor: Jerrie Pineda
  * @author (Courtnee)
 * @version (6-26-2020)
 * This is my Account class and is the requested main class for the assignment
 * and provides the behaviors
 */
public class Account
{
    private double balance = 0.0;
    //this is the constructor part of this class
    
    public Account(double InitBal)
    {
        balance = InitBal;
    }

    // this is the Accessment point of the class
    public double getBalance()
    { 
        return balance;
    }
    // This is the way to manage the account interest
    public void addInt(double interest)
    {
        balance += balance * interest;
    }
}
