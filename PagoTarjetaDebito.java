package Ejercicio33_mediosPago;

public class PagoTarjetaDebito extends MedioPago {
    private String numeroTarjeta;
    private String claveInterbancaria;
    private double saldoCuenta;

    public PagoTarjetaDebito(String titular, String moneda, String numeroTarjeta, String claveInterbancaria, double saldoCuenta) {
        super(titular, moneda);
        this.numeroTarjeta = numeroTarjeta;
        this.claveInterbancaria = claveInterbancaria;
        this.saldoCuenta = saldoCuenta;
    }

    @Override
    public boolean procesarCobro(double monto) {
        if (!super.procesarCobro(monto) || monto > saldoCuenta) {
            return false;
        }
        saldoCuenta -= monto;
        return true;
    }
}
