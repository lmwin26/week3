public class IntelliTherm {
    private double targetTemperature;
    private double sumTemperatures;
    private int readings;

    public void setTargetTemperature(double temp) {
        this.targetTemperature = temp;
    }

    public double getTargetTemperature() {
        return targetTemperature;
    }

    public void addTemperatureReading(double temp) {
        sumTemperatures += temp;
        readings++;
    }

    public double getAverageTemperature() {
        if (readings == 0) return 0.0;
        return sumTemperatures / readings;
    }
}

