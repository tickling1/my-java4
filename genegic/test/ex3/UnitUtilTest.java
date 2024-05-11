package genegic.test.ex3;

public class UnitUtilTest {
    //resultMarine = BioUnit{name='마린2', hp=50}
    //resultZealot = BioUnit{name='질럿2', hp=150}

    public static void main(String[] args) {

        Marine m1 = new Marine("마린1", 40);
        Marine m2 = new Marine("마린2", 50);
        Marine resultMarine = UnitUtil.<Marine>maxHp(m1, m2);
        System.out.println("resultMarine = " + resultMarine);
        Zealot z1 = new Zealot("질럿1", 100);
        Zealot z2 = new Zealot("질럿2", 150);
        Zealot resultZealot = UnitUtil.<Zealot>maxHp(z1, z2);
        System.out.println("resultZealot = " + resultZealot);
    }
}
