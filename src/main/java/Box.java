import java.util.ArrayList;

public class Box<T extends Fruit> {


    private ArrayList<T> fruits = new ArrayList<>();

    public Box() {

    }

    public ArrayList<T> getFruits() {
        return fruits;
    }

    public void setFruits(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        return fruits.size() * fruits.get(0).getWeightFruit();//умножаем размер массива на вес фрукта в первой ячейке массива
    }

    public boolean compare(Box anotherBox) {// сравниваем коробки
        if (getWeight() == anotherBox.getWeight()) return true;
        return false;
    }

    public void pourTo(Box<T> anotherBox) {
        anotherBox.getFruits().addAll(fruits);
        fruits.clear();
    }

    @Override
    public String toString() {
        return "Box{" +
                "fruits=" + fruits +
                '}';
    }

    public static void main(String[] args) {
        Box box = new Box();
        Box box2 = new Box();
        Apple apple = new Apple();
        Orange orange = new Orange();

        box.addFruit(apple);
        box.addFruit(apple);


        box2.addFruit(apple);
        box2.addFruit(apple);
        box2.addFruit(apple);
        box2.addFruit(apple);
        box2.addFruit(apple);
        box2.addFruit(apple);
        box2.addFruit(apple);
        box2.addFruit(orange);

        System.out.println(box.getWeight());
        System.out.println(box.getFruits());

        System.out.println(box2.getWeight());
        System.out.println(box2.getFruits());

        System.out.println(box.compare(box2));

        box2.pourTo(box);
        System.out.println(box2);
        System.out.println(box);
    }

// Не получилось сделать так чтобы коробки принимали только определённый вид фруктов.
}
