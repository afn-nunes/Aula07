package programa;

import java.util.Scanner;

import classes.Carro;
import classes.Motorista;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Carro carr = new Carro("KMZ-0934", 123456, new Motorista("André", 0001));
        

        System.out.println("Passageiro: Motorista, vamos acelerar até a 100!");
        System.out.println("Motorista: Ok. Vamos lá!");
        carr.getMotorista().acelerar(100);

        System.out.printf("Velocidade do carro: %s km/h", carr.getVelocidadeAtual());
        sc.close();
    }
}
