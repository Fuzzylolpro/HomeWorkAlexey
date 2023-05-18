package HomeWork.Lesson8.Star;

public class Rabbit extends Animal {
    @Override
    void voice() {
        System.out.println("Фырк Фырк");
    }

    @Override
    void eat(String food) {
        switch (food) {
            case "Grass" -> System.out.println("Мне нравится есть травку");
            default -> System.out.println("Мне это не нравится");
        }
    }
}
