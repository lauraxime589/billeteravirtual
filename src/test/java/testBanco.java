import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
        public void testBuscarPorId() {
            List<Usuario> usuarios = new ArrayList<>();
            usuarios.add(new Usuario("1234"));
            usuarios.add(new Usuario("5678"));
            usuarios.add(new Usuario("6789"));
            usuarios.add(new Usuario("7890"));

            // Se espera que el tamaño de lista sea el correcto
            assertEquals(4, usuarios.size());


        }
        @Test
        public void testBuscarPorId2() {
            List<Usuario> usuarios = new ArrayList<>();
            usuarios.add(new Usuario("1234"));
            usuarios.add(new Usuario("5678"));
            usuarios.add(new Usuario("6789"));
            usuarios.add(new Usuario("7890"));

            // Se espera que el tamaño de lista sea incorrecto
            assertEquals(9, usuarios.size());


        }
        @Test
        public void getUsuario() {

            List<Usuario> usuarios = new ArrayList<>();
            Usuario usuario = getUsuario(usuarios.getId());

            // Si el estudiante ya existe, lanzar una excepción
            if(usuarios!=null){
                assertEquals("");
            }else{
                usuarios.add(usuario);
            }

        }

    }


