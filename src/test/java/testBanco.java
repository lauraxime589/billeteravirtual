import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class testBanco {


    // el test pasa porque se envia un monto positivo
    @Test
    public void testTransferir() {
        List<Transaccion> transacciones = new ArrayList<Transaccion>();
        assertDoesNotThrow(() -> {
            transacciones.add(new Transaccion(3000));
        });
    }
    @Test
    public void testTransferir2() {
        Banco banco = new Banco();
        banco.transferir("1909", "-099", "Fecha y hora actual:" +, "sofia", "laura", "VIAJES" );
        boolean transferir = testTransferir2(assertFalse(false);)

    }

    @Test
    public void registrarUsuarioTest() {

        Banco banco = new Banco();

        assertDoesNotThrow(() -> {
            banco.registarUsuario("111", "ppeito", "Calle", "121212", "pepito@email.com");;
        });

    }

    @Test
    public void testBuscarPorId2() {
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("1234"));
        usuarios.add(new Usuario("5678"));
        usuarios.add(new Usuario("6789"));
        usuarios.add(new Usuario("7890"));

        // Se espera que el tamaño de lista sea incorrecto
        assertNotEquals(9, usuarios.size());


    }

    //la prueba pasa porque se busca un usuario existente por su id y no se espera un nulo
    @Test
    public void getUsuario() {

        Banco banco = new Banco();

        assertDoesNotThrow(() -> {
            banco.registarUsuario("111", "ppeito", "Calle", "121212", "pepito@email.com");;
        });

        Usuario usuario = banco.buscarPorId("111");
        assertNotNull(usuario);
    }

    //la pruba pasa porque se espera un usuaio nulo
    @Test
    public void getUsuario2 (){
        Banco banco = new Banco();

        Usuario usuario = banco.buscarPorId("111");
        assertNull(usuario);
    }
    @Test
    public void eliminarTest(){
        // Se espera que no se lance ninguna excepción al eliminar el usuario con ID 123
        assertDoesNotThrow( () -> {
            Banco.re("123");
        } );

        // Se espera que el usuario con ID 123 no exista
        Usuario usuario  = Usuario.getId("123");
        assertNull(usuario);
    }

}
}



