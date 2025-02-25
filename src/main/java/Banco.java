import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Usuario> usuarios;
    private List<BilleteraVirtual> billeteras;
    private double saldo;
    private double monto;
    private List<Transaccion> transacciones;
    private Usuario usuario;

    public Banco() {
        this.usuarios = new ArrayList<Usuario>();
        this.billeteras = new ArrayList<BilleteraVirtual>();
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    //método para transferir dinero a otras billeteras
    public boolean transferir(double monto, BilleteraVirtual emisor, BilleteraVirtual receptor) throws Exception {
        if (monto <= 0) {
            throw new Exception("monto invalido, ingrese un monto de dinero positivo");

        }

        double costoTransaccion = 200.0;

        if (monto + costoTransaccion > saldo)
            throw new Exception("saldo insuficiente para transferir");

        saldo -= (monto + costoTransaccion);
        transacciones.add(new Transaccion(monto));

        return true;

    }

    public Banco(List<Usuario> usuarios, List<BilleteraVirtual> billeteras, double saldo, double monto, List<Transaccion> transacciones) {
        this.usuarios = usuarios;
        this.billeteras = billeteras;
        this.saldo = saldo;
        this.monto = monto;
        this.transacciones = transacciones;
    }

    //método para registarr usuario y su billetera
    public void registarUsuario(String id, String nombre, String contraseña, String correo) throws Exception {
        if (buscarPorId(id) != null) {
            throw new Exception("Usuario ya existe");
        }

    }

    //método para buscar usuario porid
    public Usuario buscarPorId(String id) {
        for (Usuario usuario : usuarios)
            if (usuario.getId().equals(id))
                return usuario;


        return null;
    }

    //método para buscar usuario por contraseña
    public Usuario buscarPorContraseña(String contraseña) {
        for (Usuario usuario : usuarios)
            if (usuario.getContraseña().equals(contraseña))
                return usuario;


        return null;
    }

    //método para mostrar transacciones por id o contraseña
    public void mostrarTransacciones (String id, String contraseña) throws Exception{

        Usuario usuario = buscarPorId(id);

        if( usuario == null) {
            throw new Exception("Usuario no encontrado");

        }
        if(! usuario.getContraseña().equals(contraseña)){
            throw new Exception("La contraseña es incorrecta");
        }
        for(BilleteraVirtual billetera : billeteras){
            if(billetera.getUsuario().equals(id)) {

                System.out.println("Transacciones de la billetera con ID: " + billetera.getNumeroBilletera());
                for(Transaccion transaccion : billetera.getTransacciones()){
                    System.out.println(transaccion);
                }
                return;
            }
        }
        throw new Exception("No se puede mostrar la transaccion");


    }

}


