import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    // instances variable declarations
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        System.out.print("Notify Observers\n");
        if (!observers.isEmpty()){
            for (Observer observer : observers) {
                observer.update(temperature, humidity, pressure);
            }
        } else {
            System.out.print("There are no observers.\n");
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    // other WeatherData methods here
}
