public class Car extends Transport {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель у автомобиля");
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у автомобиля");
    }
    @Override
    public void checkF() {
        printTyresCheck();
        checkEngine();
    }
}