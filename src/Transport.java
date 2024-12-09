public abstract  class Transport implements Check{
    public String modelName;
    public int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    @Override
    public void check() {
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }

    public  void updateTyre(){
        System.out.println("Меняем шины");
    }

}
