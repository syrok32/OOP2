public class Car extends Transport {

    private String modelName;
    private int wheelsCount;

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);

    }

    @Override
    public void check() {
        super.check();

        checkEngine();
    }
    public void checkEngine() {
        System.out.println("Дивгатель проверен");
    }

}