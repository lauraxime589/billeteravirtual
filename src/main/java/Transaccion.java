
import java.time.LocalDateTime;

public class Transaccion {

    private String id;
    private LocalDateTime fecha;
    private Enum categoria;
    private BilleteraVirtual origen;
    private BilleteraVirtual destino;
    private float monto;

    public Transaccion(String id, LocalDateTime fecha, Enum categoria, BilleteraVirtual origen, BilleteraVirtual destino, float monto) {
        this.id = id;
        this.fecha = fecha;
        this.categoria = categoria;
        this.origen = origen;
        this.destino = destino;
        this.monto = monto;
    }


}
