package HW4.P2;

import java.time.LocalTime;

public class SensorTest {
    static void main(String[] args) {
        Sensor[] sensors = {
                new LightSensor("Garden", LocalTime.now(), 80),
                new SoundSensor("Bedroom", LocalTime.now(), 80),
                new TemperatureSensor("Living Room", LocalTime.now(), 16),
                new LightSensor("Kitchen", LocalTime.now(), 110),
                new TemperatureSensor("Stairwell", LocalTime.now(), 31)
        };
        for (Sensor sensor : sensors) {
            System.out.println(sensor);
        }
    }
}
