public abstract class Transport {
    private String modelName;
    private int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public abstract void updateTyre();

    public void printTyresCheck() {
        System.out.println("Обслуживаем " + this.getModelName());
        for (int j = 0; j < this.getWheelsCount(); j++) {
            updateTyre();
        }
    }

    public abstract void checkF();

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }
}