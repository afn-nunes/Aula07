package programa;

import java.util.Scanner;

import classes.Carro;
import classes.Motorista;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Carro carr = new Carro("KMZ-0934", 123456);
        Motorista mot = new Motorista(carr);
        mot.acelerar(100);
        sc.close();
    }
}
