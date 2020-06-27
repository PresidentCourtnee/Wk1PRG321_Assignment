import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of class Account here. Week 1 Assignment ?1 Answer
 *for PRG321 - Jerrie Pineda
 * @author (Courtnee)
 * @version (6-26-2020)
 */
public class AccountTest
{
    private Account account;
    /**
     * This is called before every test case method.
     */
    @Before
    public void setUp()
    {
        account = new Account(1000);
    }
    @Test
    public void testaddInt()
    {
        double newBalance = account.addInt(.05); 
        
        account.addInt(.05);
        System.out.print("Interest after 1st year: " + account.getBalance());
        assert(newBalance == 1050);
        
        account.addInt(.05);
        System.out.print("Interest after 2nd year: " + account.getBalance());
        assert(newBalance() == 1102.5);
        
        account.addInt(.05);
        System.out.print("Interest after 3rd year: "+ account.getBalanace());
        assert(newBalance() ==1157.625);
    }
}
