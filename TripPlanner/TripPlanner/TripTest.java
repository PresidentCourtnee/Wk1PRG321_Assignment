import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TripTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TripTest
{
    @Test
    public void TripTest()
    {
        Trip tp=new Trip();
        tp.setDestination("Utah");
        tp.setDistance(20);
        
        assert(tp.MPG());
        assert(tp.getCostPGal());
        
    }
}
