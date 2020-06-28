import org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Project: Week 1 Assignment Answer to Question #1
 * Class PRG321
 * Instructor: Jerrie Pineda
  * @author (Courtnee)
 * @version (6-26-2020)
 * This is the test class for Account
 */
public class AccountTest
{// this is a set up class
    private Account account;
    /**
     * This is called before every test case method.
     */
    @Before
    public void setUp()
    {
        account = new Account(1000);
    }
    // this is going to test 
    @Test
    public void testInterest()
    {
        System.out.print("Interest after 1st year: "); 
        account.addInt(.05);
        assert(account.getBalance() == 1050);
        
        System.out.print("Interest after 2nd year: ");
        account.addInt(.05);
        assert(account.getBalance() == 1102.5);
        
        System.out.print("Interest after 3rd year: ");
        account.addInt(.05);
        assert(account.getBalance() ==1157.625);
    }
}
