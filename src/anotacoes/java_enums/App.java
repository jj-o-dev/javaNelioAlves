package anotacoes.java_enums;

public class App {
    public static void main(String[] args) {
        Compass bussola1 = new Compass(Cardinal.NORTH);
        Compass bussola2 = new Compass(Cardinal.WEST);

        System.out.println(bussola1);
        System.out.println(bussola2);
    }
}
