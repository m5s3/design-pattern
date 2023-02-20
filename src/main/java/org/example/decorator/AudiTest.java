package org.example.decorator;

public class AudiTest {
    public static void main(String[] args) {
        ICar audi = new Audi(2000);
        audi.showPrice();
        ICar a3 = new A3(audi, "A3");
        a3.showPrice();
        ICar a4 = new A4(audi, "A4");
        a4.showPrice();
        ICar a5 = new A5(audi, "A5");
        a5.showPrice();
    }
}
