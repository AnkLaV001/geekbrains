public abstract class Fruit {
    private float quantityFruit;
    private float weightFruit;

    public Fruit(float quantityFruit, float weightFruit) {
        this.quantityFruit = quantityFruit;
        this.weightFruit = weightFruit;
    }

    public float getQuantityFruit() {
        return quantityFruit;
    }

    public void setQuantityFruit(float quantityFruit) {
        this.quantityFruit = quantityFruit;
    }

    public float getWeightFruit() {
        return weightFruit;
    }

    public void setWeightFruit(float weightFruit) {
        this.weightFruit = weightFruit;
    }
}
