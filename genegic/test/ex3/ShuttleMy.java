package genegic.test.ex3;

public class ShuttleMy<T extends BioUnit> {

    private String name;
    private int Hp;
    public void in(T t) {
        this.Hp = t.getHp();
        this.name = t.getName();
    }

    public void showInfo() {
        System.out.println("이름: " + name + ", Hp: " + Hp);
    }
}
