package HW4.P2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TemperatureSensor implements Sensor{
    String location;
    LocalTime lastUpdated;
    double temperature;

    public TemperatureSensor(String location, LocalTime lastUpdated, double temperature) {
        this.location = location;
        this.lastUpdated = lastUpdated;
        this.temperature = temperature;
    }

    @Override
    public String getSensorType() {
        return "Temperature";
    }

    @Override
    public double getReading() {
        return this.temperature;
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
        if (this.temperature>30)
            return "An alert to turn on the AC";
        else if (this.temperature<18)
            return "An alert to turn on the Heater";
        else
            return "Temperature is in normal range";
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
