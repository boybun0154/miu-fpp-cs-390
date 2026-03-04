package HW4.P2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LightSensor implements Sensor {
    String location;
    LocalTime lastUpdated;
    double lightLevel;

    public LightSensor(String location, LocalTime lastUpdated, double lightLevel) {
        this.location = location;
        this.lastUpdated = lastUpdated;
        this.lightLevel = lightLevel;
    }

    @Override
    public String getSensorType() {
        return "Light";
    }

    @Override
    public double getReading() {
        return this.lightLevel;
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
        if (this.lightLevel<100)
            return "An alert to turn on the light";
        else
            return "Light is sufficient";
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
