
interface Drivable {
    void start();
    void stop();
    void drive(int distance);
}


public class Car implements Drivable {
    private String make;
    private String model;
    private int year;

    private boolean isRunning;

    // Конструктор
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.isRunning = false;
    }

    // Методы получения (getters)
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // Методы установки (setters)
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Реализация методов интерфейса Drivable
    @Override
    public void start() {
        if (!isRunning) {
            isRunning = true;
            System.out.println("Car started.");
        } else {
            System.out.println("Car is already running.");
        }
    }

    @Override
    public void stop() {
        if (isRunning) {
            isRunning = false;
            System.out.println("Car stopped.");
        } else {
            System.out.println("Car is already stopped.");
        }
    }

    @Override
    public void drive(int distance) {
        if (isRunning) {
            System.out.println("Car drove " + distance + " kilometers.");
        } else {
            System.out.println("Start the car first!");
        }
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2021);
        car.start();
        car.drive(10);
        car.stop();
    }
}
