import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruitBox;

    public Box(ArrayList<T> fruitBox) {
        this.fruitBox = fruitBox;
    }

    public ArrayList<T> getFruitBox() {
        return fruitBox;
    }

    public void setFruitBox(ArrayList<T> fruitBox) {
        this.fruitBox = fruitBox;
    }

    public float addFruits(ArrayList<T> newFruits, int fruits){
        for (int i = 0; i < fruits; i++) {
            newFruits.set(newFruits.size() + 1, newFruits<>());
        }
        return newFruits.size();
    }

    public float getWeight(){
        if (fruitBox.size() == 0){
            return 0f;
        } else {
            return fruitBox.size() * fruitBox.get(0).getWeightFruit();
        }
    }

    public boolean compareTo(Box<?> box){
        return this.getWeight() == box.getWeight();
    }
}
