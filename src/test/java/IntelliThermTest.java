import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IntelliThermTest {

    @Test
    public void testTargetTemperature() {
        IntelliTherm therm = new IntelliTherm();
        therm.setTargetTemperature(72.5);
        assertEquals(72.5, therm.getTargetTemperature());
    }

    @Test
    public void testAverageTemperature() {
        IntelliTherm therm = new IntelliTherm();
        therm.addTemperatureReading(70.0);
        therm.addTemperatureReading(74.0);
        assertEquals(72.0, therm.getAverageTemperature());
    }
}

