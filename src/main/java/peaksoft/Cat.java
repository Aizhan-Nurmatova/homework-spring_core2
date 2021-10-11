package peaksoft;

public class Cat implements Animal{
    private String breed;
    private String color;
    private int weight;
    private int age;

    @Override
    public void animalPlus() {
        System.out.println("Dog is add");
    }

    @Override
    public void animalMinus() {
        System.out.println("Dog is deleted");
    }

    public Cat() {

    }

    public Cat(String breed, String color, int weight, int age) {
        this.breed = breed;
        this.color = color;
        this.weight = weight;
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat " +
                "breed:'" + breed + '\'' +
                ", color:'" + color + '\'' +
                ", weight:" + weight +
                ", age:" + age;
    }
}
