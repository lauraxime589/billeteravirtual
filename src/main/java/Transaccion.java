
import java.time.LocalDateTime;

public class Transaccion {
    private String id;
    private double monto;
    private LocalDateTime fecha;
    private BilleteraVirtual emisor;
    private BilleteraVirtual receptor;
    private Categoria categoria;

    public Transaccion(String tipo, double monto, String emisor, String receptor) {
        this.id = id;
        this.monto = monto;
        this.fecha = LocalDateTime.now();

    }

    public Transaccion(String id, double monto, LocalDateTime fecha, BilleteraVirtual emisor, BilleteraVirtual receptor, Categoria categoria) {
        this.id = id;
        this.monto = monto;
        this.fecha = fecha;
        this.emisor = emisor;
        this.receptor = receptor;
        this.categoria = categoria;
    }

    public Transaccion(double monto) {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public BilleteraVirtual getEmisor() {
        return emisor;
    }

    public void setEmisor(BilleteraVirtual emisor) {
        this.emisor = emisor;
    }

    public BilleteraVirtual getReceptor() {
        return receptor;
    }

    public void setReceptor(BilleteraVirtual receptor) {
        this.receptor = receptor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}