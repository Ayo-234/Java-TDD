import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.*;


public class PrimeCheckerTest {

    @Test
    public void checkIfANumberIsPrime(){
        PrimeChecker primeCheck = new PrimeCheck();

        // Assert.assertEquals(true, primeCheck.isPrime(2));
        assertTrue("2 should be a prime number", primeCheck.isPrime(2));
        assertTrue("7 should be a prime number", primeCheck.isPrime(7));

        assertFalse("16 should not be a prime number", primeCheck.isPrime(16));
        assertFalse("66 should not be a prime number", primeCheck.isPrime(66));
        assertFalse("0 should not be a prime number", primeCheck.isPrime(0));
        
    }  
}
