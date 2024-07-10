public class Fitbyte {
    private int age;
    private int heartRate;

    public Fitbyte(int age, int heartRate){
        this.age = age;
        this.heartRate = heartRate;
    }

    public double targetHeartRate(double percentageOfMaximum){
        double maximumHeartRate = 206.3 - (0.711 * this.age);
        return (maximumHeartRate - this.heartRate) * percentageOfMaximum + this.heartRate;
    }
}
