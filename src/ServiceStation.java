public class ServiceStation implements ServiceTransport {
    @Override
    public void check(Car[] car) {
        System.out.println("---------------------");
        printCheck(car);
        checkEngine();
        System.out.println("---------------------");
    }

    @Override
    public void check(Truck[] truck) {
        System.out.println("---------------------");
        printCheck(truck);
        checkEngine();
        checkTrailer();
        System.out.println("---------------------");
    }

    @Override
    public void check(Bicycle[] bicycle) {
        System.out.println("---------------------");
        printCheck(bicycle);
        System.out.println("---------------------");
    }

    private void printCheck(Transport[] transport) {
        for (int i = 0; i < transport.length; i++) {
            Transport transp = transport[i];
            System.out.println("Обслуживаем " + transp.getModelName());
            for (int j = 0; j < transp.getWheelsCount(); j++) {
                updateTyre();
            }
        }
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}