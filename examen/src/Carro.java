public class Carro extends Vehiculo{

    private int autonomia;
    private int gal_combustible;

    private String tipo_combustible;
    private int pasajeros;
    private Boolean encendido;

    public Carro(String marca, String modelo, String color, int autonomia, int gal_combustible,String tipo_combustible, int pasajeros, Boolean encendido) {
        super(marca, modelo, color);
        this.autonomia = autonomia;
        this.gal_combustible = gal_combustible;
        this.tipo_combustible = tipo_combustible;
        this.pasajeros = pasajeros;
        this.encendido = encendido;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public int getGal_combustible() {
        return gal_combustible;
    }

    public void setGal_combustible(int gal_combustible) {
        this.gal_combustible = gal_combustible;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public Boolean getEncendido() {
        return encendido;
    }

    public void setEncendido(Boolean encendido) {
        this.encendido = encendido;
    }

    public String getTipo_combustible() {
        return tipo_combustible;
    }

    public void setTipo_combustible(String tipo_combustible) {
        this.tipo_combustible = tipo_combustible;
    }

    public void encender(){
        encendido = true;
        System.out.println("el auto está encendido");
    }

    public void cal_duracion(){
        System.out.println("el carro tiene combustible para "+ autonomia*gal_combustible +" kilometros");
    }


    public void imprimir() {
        System.out.println("Carro:" );
        super.imprimir();
        System.out.println("Autonomia: " + autonomia);
        System.out.println("Galones de combustible: " + gal_combustible);
        System.out.println("Tipo de combustible: " + tipo_combustible);
        System.out.println("Cantidad de pasajeros: " + pasajeros );
        System.out.println();
    }
}
