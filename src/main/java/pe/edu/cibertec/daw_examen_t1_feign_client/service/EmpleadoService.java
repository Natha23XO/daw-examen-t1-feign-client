package pe.edu.cibertec.daw_examen_t1_feign_client.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.daw_examen_t1_feign_client.restclient.placeholder.iclientservice.ClienteClient;
import pe.edu.cibertec.daw_examen_t1_feign_client.restclient.placeholder.iclientservice.EmpleadoClient;
import pe.edu.cibertec.daw_examen_t1_feign_client.restclient.placeholder.model.Cliente;
import pe.edu.cibertec.daw_examen_t1_feign_client.restclient.placeholder.model.Empleado;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmpleadoService {

    private final EmpleadoClient empleadoClient;

    public List<Empleado> findAll() {
        return empleadoClient.obtenerEmpleados();
    }

    public Empleado findById(int id) {
        return empleadoClient.obtenerEmpleadoXId(id);
    }

    public Empleado create(Empleado empleado) {
        return empleadoClient.crearEmpleado(empleado);
    }

    public Empleado update(Empleado empleado, Long id) {
        return empleadoClient.actualizarEmpleado(empleado, id);
    }

    public String delete(int id) {
        return empleadoClient.eliminarEmpleado(id);
    }
}
