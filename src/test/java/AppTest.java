import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testSmallPrime(){
        App appObj = new App();
        assertEquals(appObj.isPrime(17), true);

    }
    public void testSmallNoPrime(){
        App appObj = new App();
        assertEquals(appObj.isPrime(33), false);

    }
    public void testLargePrime(){
        App appObj = new App();
        assertEquals(appObj.isPrime(32416189049L), true);

    }

    public void testLargeNoPrime(){
        App appObj = new App();
        assertEquals(appObj.isPrime(32416189051L), false);

    }
}
