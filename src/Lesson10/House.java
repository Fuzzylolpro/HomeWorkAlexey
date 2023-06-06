package Lesson10;

import java.util.Objects;

public class House implements Cloneable{
    int cost;
    String color;
    private Dog dog;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    String name = "Dima";
    String name1 = "Dima";

    @Override
    public String toString() {
        return "Old.House{" +
                "cost=" + cost +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", name1='" + name1 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return cost == house.cost && Objects.equals(color, house.color) && Objects.equals(name, house.name) && Objects.equals(name1, house.name1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cost, color, name, name1);
    }

    /*@Override
    protected Object clone() throws CloneNotSupportedException {
        Old.House house = (Old.House) super.clone();
        house.dog = (Dog) dog.clone();
        return house;*/

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();

    }
}

