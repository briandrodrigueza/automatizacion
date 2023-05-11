public class Main {
    public static void main(String[] args) {

        // Crear objeto CuentaAhorros con saldo inicial de 15000 y tasa anual del 5%
        CuentaAhorros cuentaAhorros = new CuentaAhorros(15000, 5);

        // Consignar 5000 a la cuenta
        cuentaAhorros.consignar(5000);

        // Retirar 10000 de la cuenta
        cuentaAhorros.retirar(10000);

        // Consignar 15000 a la cuenta
        cuentaAhorros.consignar(15000);

        // Realizar extracto mensual
        cuentaAhorros.extractoMensual();

        // Imprimir información de la cuenta
        cuentaAhorros.imprimir();
    }
}