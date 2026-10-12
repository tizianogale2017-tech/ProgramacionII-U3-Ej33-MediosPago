package Ejercicio33_mediosPago;

public class MedioPago {
    private String titular;
    private String moneda;

    public MedioPago(String titular, String moneda) {
        this.titular = titular;
        this.moneda = moneda;
    }

    public boolean procesarCobro(double monto) {
        return monto > 0;
    }

    public String getTitular() {
        return titular;
    }

    public String getMoneda() {
        return moneda;
    }
}
