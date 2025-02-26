import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BilleteraVirtual {
    private String numeroBilletera;
    private double saldo;
    private List<Transaccion> transacciones;
    private Usuario usuario;
    private LocalDateTime fecha;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public BilleteraVirtual(Usuario usuario) {
        this.usuario = usuario;
    }

    public BilleteraVirtual(){
        this.numeroBilletera = generarNumeroBilletera();
        this.saldo=0.0;
        this.transacciones=new ArrayList<Transaccion>();

    }

    //método para generar el numero de billetera
    private String generarNumeroBilletera(){
        long numero = (long)(Math.random()*9000000000L)+1000000000L;
        return String.valueOf(numero);
    }

    public String getNumeroBilletera() {
        return numeroBilletera;
    }

    public void setNumeroBilletera(String numeroBilletera) {
        this.numeroBilletera = numeroBilletera;
    }

    public BilleteraVirtual(String numeroBilletera, double saldo, List<Transaccion> transacciones) {
        this.numeroBilletera = numeroBilletera;
        this.saldo = saldo;
        this.transacciones = transacciones;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(List<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    //método para recargar saldo
    public void recargarSaldo(double monto) throws Exception{
        if (monto<=0){
            throw new Exception("Ingrese un monto de dinero positivo");
        }
        saldo+=monto;
        transacciones.add(new Transaccion(monto));
    }

    //método para consultar saldo
    public double consultarSaldo(){
        return saldo;
    }

    //método para mostrar transacciones
    public void mostrarTransacciones() throws Exception{
        if (transacciones.isEmpty()){
            throw new Exception("No se puede mostrar la lista de transacciones");
        }
        for (Transaccion t : transacciones){
            System.out.println(t);
        }


    }
    //método para consultar transacciones en un tiempo determinado
    public List<Transaccion> consultarTransaccionesPorPeriodo(LocalDateTime fechaInicio, LocalDateTime fechaFin) {
        List<Transaccion> transaccionesEnPeriodo = new ArrayList<>();
        for (Transaccion t : transacciones){
            LocalDateTime fechaTransaccion = transacciones.getFirst().getFecha();
            if ((fechaTransaccion.isEqual(fechaInicio) || fechaTransaccion.isAfter(fechaInicio)) &&
                    (fechaTransaccion.isEqual(fechaFin) || fechaTransaccion.isBefore(fechaFin))){
                transaccionesEnPeriodo.add(t);
            }
        }
        return transaccionesEnPeriodo;
    }



}








