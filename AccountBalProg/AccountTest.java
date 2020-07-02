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
    private Account account = new Account(1000);
    
    // this is going to test 
    @Test
    public void testInterest()
    {
        account.addInt(.05);
        System.out.println("Interest after 1st year: "+account.getBalance());
        assert(account.getBalance()==1050);
        
        account.addInt(.05);
        System.out.println("Interest after 2nd year: "+account.getBalance());
        assert(account.getBalance()==1102.5);
        
        account.addInt(.05);
        System.out.println("Interest after 3rd year: "+account.getBalance());
        assert(account.getBalance()==1157.625);
               
    }
}
