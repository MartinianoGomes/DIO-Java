import entities.*;

public class App {
    public static void main(String[] args) {
        SmartTV smartTv = new SmartTV(false, 0, 0);

        smartTv.ligar();

        smartTv.subirCanal();

        smartTv.aumentarVolume();

        System.out.println("A TV está ligada? " + smartTv.estaLigada());
        System.out.println("A TV está no canal " + smartTv.qualCanal());
        System.out.println("A TV está no volume " + smartTv.qualVolume());
    }
}