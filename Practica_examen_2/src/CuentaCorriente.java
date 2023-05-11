public class CuentaCorriente extends Cuenta {
    private float sobregiro;

    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        this.sobregiro = 0;
    }

    public float getSobregiro() {
        return sobregiro;
    }

    @Override
    public void retirar(float cantidad) {
        if (cantidad > saldo + sobregiro) {
            System.out.println("Error: no se puede retirar esa cantidad.");
        } else if (saldo >= cantidad) {
            saldo -= cantidad;
        } else {
            sobregiro -= cantidad - saldo;
            saldo = 0;
        }
        numRetiros++;
    }

    @Override
    public void consignar(float cantidad) {
        super.consignar(cantidad);
        if (sobregiro > 0) {
            sobregiro -= cantidad;
            if (sobregiro < 0) {
                saldo += sobregiro;
                sobregiro = 0;
            }
        }
    }

    @Override
    public void extractoMensual() {
        super.extractoMensual();
    }

    public void imprimir() {
        System.out.println("Saldo: $" + saldo);
        System.out.println("Comisión mensual: $" + comisionMensual);
        System.out.println("Transacciones realizadas: " + (numConsignaciones + numRetiros));
        System.out.println("Sobregiro: $" + sobregiro);
    }
}
