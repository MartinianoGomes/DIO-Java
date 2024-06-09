package entities;

public class SmartTV {
    private Boolean ligada;
    private Integer canal;
    private Integer volume;

    public void SmartTV(Boolean ligada, Integer canal, Integer volume) {
        this.ligada = ligada;
        this.canal = canal;
        this.volume = volume;
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void subirCanal() {
        canal++;
    }

    public void descerCanal() {
        canal--;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }
}