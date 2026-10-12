package Ejercicio33_mediosPago;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MedioPago> medios = new ArrayList<>();
        medios.add(new PagoTarjetaDebito("Sergio Lima", "ARS", "4000123412341234", "0170099220000012345678", 90000.0));
        medios.add(new PagoCriptomoneda("Sergio Lima", "USDT", "0xAB12...CD34", "Ethereum", 60000.0));
        medios.add(new PagoBilleteraVirtual("Sergio Lima", "ARS", "sergio.lima", 60000.0));

        double[] montos = {50000.0, 50000.0};
        for (MedioPago m : medios) {
            for (double monto : montos) {
                boolean ok = m.procesarCobro(monto);
                System.out.println(m.getClass().getSimpleName() + " (" + m.getMoneda() + ") cobro de " + monto + ": " + (ok ? "COMPROBANTE EMITIDO" : "RECHAZADO"));
            }
        }
    }
}
