public class Usuario {
    private String nombre;
    private String id;
    private String direccion;
    private String email;
    private String contrasena;
    private Usuario usuario;

    public Usuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public static void remove(Usuario usuario) {
    }


    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContraseña(String contrasena) {
        this.contrasena = contrasena;
    }

    public Usuario(String contrasena) {
        this.contrasena = contrasena;
    }

    public Usuario(String id, String nombre, String direccion, String contrasena, String email) {
        this.nombre = nombre;
        this.id = id;
        this.direccion = direccion;
        this.contrasena = contrasena;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}