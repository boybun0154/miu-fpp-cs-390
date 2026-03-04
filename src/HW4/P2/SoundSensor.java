package HW4.P2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SoundSensor implements Sensor{
    String location;
    LocalTime lastUpdated;
    double soundLevel;

    public SoundSensor(String location, LocalTime lastUpdated, double soundLevel) {
        this.location = location;
        this.lastUpdated = lastUpdated;
        this.soundLevel = soundLevel;
    }

    @Override
    public String getSensorType() {
        return "Sound";
    }

    @Override
    public double getReading() {
        return this.soundLevel;
    }

    @Override
    public String getLocation() {
        return this.location;
    }

    @Override
    public LocalTime getLastUpdated() {
        this.lastUpdated = LocalTime.now();
        return this.lastUpdated;
    }

    @Override
    public String performAction() {
        if (this.soundLevel>70)
            return "An alert to turn on noise cancellation";
        else
            return "Sound is within normal range";
    }

    @Override
    public String toString() {
        return "Sensor Type: "+getSensorType()+
                "\nReading: "+getReading()+
                "\nLocation: "+getLocation()+
                "\nLast Updated: "+ getLastUpdated().format(DateTimeFormatter.ofPattern("HH:mm a"))+
                "\nAction: "+performAction()+"\n";
    }
}
