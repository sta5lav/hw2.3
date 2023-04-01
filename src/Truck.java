public class Truck extends Car {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у грузовика");
    }
    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель у грузовика");
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
    @Override
    public void checkF() {
        printTyresCheck();
        checkEngine();
        checkTrailer();
    }
}