package genegic.ex1;

public class GenericBox<Hello> {

    private Hello value;

    public void set(Hello value) {
        this.value = value;
    }

    public Hello get() {
        return value;
    }
}
