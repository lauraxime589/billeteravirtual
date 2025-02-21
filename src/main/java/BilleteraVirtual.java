import java.util.ArrayList;
import java.util.List;

public class BilleteraVirtual  {


        private static long contadorBilletera = 10000000000L;
        private String numeroBilletera;
        private double saldo;
        private List<Transaccion> transacciones;
        private Usuario usuario;


        public BilleteraVirtual() {

            this.numeroBilletera = generarNumeroBilletera();
            this.saldo = 0.0;
            this.transacciones = new ArrayList<>();
        }


    public void recargarSaldo(double monto) throws Exception {
        if (monto <= 0) {
            throw new Exception ("Ingrese un monto positivo");


        }
        saldo += monto;
        transacciones.add(new Transaccion(monto));
    }

    public boolean transferir(double monto, String destinatario, String categoria) throws Exception {
        if (monto <= 0) {
            throw new Exception ("ingrese un monto positivo");
        }

        double costoTransaccion = 200.0;
        if (monto + costoTransaccion > saldo) {
            throw new Exception ("saldo Insifuciente ");
        }

        saldo -= (monto+costoTransaccion);
        transacciones.add(new Transaccion(monto, destinatario, categoria));
        return true;
    }



    public double consultarSaldo() {
        return saldo;
    }

    public void mostrarTransacciones() throws Exception {
        if (transacciones.isEmpty()) {
            throw new Exception ("No hay transacciones");
        }
        for (Transaccion t : transacciones) {
            System.out.println(t);
        }

    }
    private String generarNumeroBilletera () {
        contadorBilletera++;

        String numero = Long.toString(BilleteraVirtual.contadorBilletera);
        while (numero.length() < 10) {
            numero = "0" + numero;
        }
        return numero;

    }
    public String getNumeroBilletera () {
        return numeroBilletera;
    }

}


