
/**
 * Write a description of class Account here. Week 1 Assignment ?1 Answer
 *for PRG321 - Jerrie Pineda
 * @author (Courtnee)
 * @version (6-26-2020)
 */
public class Account
{
    private double balance = 0.0;
    
    //construc
    public Account(double PrimBal)
    {
        balance = PrimBal;
    }
    public double getNewBal()
    { 
        return balance;
    }
    public void addInt(double interest)
    {
        balance = balance * interest;
    }
}
