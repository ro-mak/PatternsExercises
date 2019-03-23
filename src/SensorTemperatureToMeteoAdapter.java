import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class SensorTemperatureToMeteoAdapter implements MeteoSensor {


    private SensorTemperature sensorTemperature;

    public SensorTemperatureToMeteoAdapter(SensorTemperature sensorTemperature){

        this.sensorTemperature = sensorTemperature;
    }

    @Override
    public int getId() {
        return sensorTemperature.identifier();
    }

    @Override
    public Float getTemperature() {
        return (float)sensorTemperature.temperature();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        int year = sensorTemperature.year();
        int day = sensorTemperature.day();
        int second = sensorTemperature.second();
        return LocalDateTime.of(LocalDate.ofYearDay(year,day),LocalTime.ofSecondOfDay(second));
    }
}
