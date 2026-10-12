package Ejercicio33_mediosPago;

public class PagoBilleteraVirtual extends MedioPago {
    private String alias;
    private double limiteDiario;
    private double gastadoHoy;

    public PagoBilleteraVirtual(String titular, String moneda, String alias, double limiteDiario) {
        super(titular, moneda);
        this.alias = alias;
        this.limiteDiario = limiteDiario;
        this.gastadoHoy = 0;
    }

    @Override
    public boolean procesarCobro(double monto) {
        if (!super.procesarCobro(monto) || gastadoHoy + monto > limiteDiario) {
            return false;
        }
        gastadoHoy += monto;
        return true;
    }
}
