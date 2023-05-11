public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("chevrolet","2018","rojo",20,
                5,"gasolina",5,    false);

        Moto moto = new Moto("Honda","2013","Azul",250,10);

        carro.imprimir();
        moto.imprimir();
        carro.cal_duracion();
        carro.setGal_combustible(10);
        carro.cal_duracion();
        carro.encender();

    }
}