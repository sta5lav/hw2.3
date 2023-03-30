public class Main {
    public static void main(String[] args) {
        Car[] car = {
                new Car("car1", 4),
                new Car("car2", 4),
        };

        Truck[] truck = {
                new Truck("truck1", 6),
                new Truck("truck2", 8),

        };

        Bicycle[] bicycle = {
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2),
        };

        ServiceTransport station = new ServiceStation();
        checkStation(station, car, truck, bicycle);

    }
    public static void checkStation(ServiceTransport station, Car[] car,  Truck[] truck, Bicycle[] bicycle) {
        station.check(car);
        station.check(truck);
        station.check(bicycle);
    }

}