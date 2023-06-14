package Lesson15;

public class GenericExample <T1,T2>{
    private T1 value;
    private T2 secondValue;

    public T1 getValue() {
        return value;
    }

    public void setValue(T1 value) {
        this.value = value;
    }
}
