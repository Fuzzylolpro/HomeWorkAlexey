package HomeWork.Lesson8.Star;

public class Tiger extends Animal {
    @Override
    void voice() {
        System.out.println("Ррр ррр");
    }

    @Override
    void eat(String food) {
        switch (food) {
            case "Meat" -> System.out.println("Мне нравится есть мясо");
            default -> System.out.println("Мне это не нравится");
        }
    }

}
