public class Moto extends Vehiculo{

    private int cilindaje;
    private int potencia;

    public Moto(String marca, String modelo, String color, int cilindaje, int potencia) {
        super(marca, modelo, color);
        this.cilindaje = cilindaje;
        this.potencia = potencia;
    }

    public int getCilindaje() {
        return cilindaje;
    }

    public void setCilindaje(int cilindaje) {
        this.cilindaje = cilindaje;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void encender(){
        System.out.println("la moto está encendido");
    }


    public void imprimir() {
        System.out.println("Moto: ");
        super.imprimir();
        System.out.println("Cilindaje: " + cilindaje );
        System.out.println("Potencia: " + potencia);
    }
}
