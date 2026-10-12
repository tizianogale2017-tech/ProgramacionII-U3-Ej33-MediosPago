package Ejercicio33_mediosPago;

public class PagoCriptomoneda extends MedioPago {
    private String direccionWallet;
    private String redBlockchain;
    private double saldoWallet;

    public PagoCriptomoneda(String titular, String moneda, String direccionWallet, String redBlockchain, double saldoWallet) {
        super(titular, moneda);
        this.direccionWallet = direccionWallet;
        this.redBlockchain = redBlockchain;
        this.saldoWallet = saldoWallet;
    }

    @Override
    public boolean procesarCobro(double monto) {
        double comisionRed = monto * 0.02;
        if (!super.procesarCobro(monto) || monto + comisionRed > saldoWallet) {
            return false;
        }
        saldoWallet -= monto + comisionRed;
        return true;
    }
}
