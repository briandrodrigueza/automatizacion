public class CuentaAhorros extends Cuenta {
    private boolean cuentaActiva;

    public CuentaAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        cuentaActiva = saldo >= 10000;
    }

    @Override
    public void consignar(float cantidad) {
        if (cuentaActiva) {
            super.consignar(cantidad);
            cuentaActiva = saldo >= 10000;
        } else {
            System.out.println("Error: Cuenta inactiva");
        }
    }

    @Override
    public void retirar(float cantidad) {
        if (cuentaActiva) {
            super.retirar(cantidad);
            cuentaActiva = saldo >= 10000;
        } else {
            System.out.println("Error: Cuenta inactiva");
        }
    }

    @Override
    public void extractoMensual() {
        if (numRetiros > 4) {
            comisionMensual += (numRetiros - 4) * 1000;
        }
        super.extractoMensual();
        cuentaActiva = saldo >= 10000;
    }

    @Override
    public String toString() {
        return "CuentaAhorros{" +
                "cuentaActiva=" + cuentaActiva +
                '}';
    }

    public void imprimir() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Comisión mensual: " + comisionMensual);
        System.out.println("Número de transacciones realizadas: " + (numConsignaciones + numRetiros));
    }
}
