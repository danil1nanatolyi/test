import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calc = new Calculator();

    @Test
    public void testByteToKbyte(){
        assertEquals(1, calc.byteToKbyte(1024), 0);
        assertEquals(10, calc.byteToKbyte(10240), 0);
    }

    @Test
    public void testKbyteToByte(){
        assertEquals(1024, calc.kbyteToByte(1), 0);
    }
}
