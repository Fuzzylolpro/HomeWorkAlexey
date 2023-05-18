package HomeWork.Lesson8.Star;

public  class Dog extends Animal {
    @Override
    void voice() {
        System.out.println("Гав гав");
    }

    @Override
    void eat(String food) {
        switch (food) {
            case "Meat" -> System.out.println("Мне нравится есть мясо");
            default -> System.out.println("Мне это не нравится");
        }
    }

    private Dog() {
    }
}
