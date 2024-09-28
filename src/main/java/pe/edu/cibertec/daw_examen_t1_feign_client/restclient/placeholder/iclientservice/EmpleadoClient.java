package pe.edu.cibertec.daw_examen_t1_feign_client.restclient.placeholder.iclientservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.daw_examen_t1_feign_client.restclient.placeholder.model.Empleado;

import java.util.List;

@FeignClient(name = "empleadoClient", url = "http://localhost:8080/empleado")
public interface EmpleadoClient {

    @GetMapping("/findAll")
    List<Empleado> obtenerEmpleados();

    @GetMapping("/find/{id}")
    Empleado obtenerEmpleadoXId(@PathVariable("id") int id);

    @PostMapping("/create")
    Empleado crearEmpleado(@RequestBody Empleado empleado);

    @PutMapping("/update/{id}")
    Empleado actualizarEmpleado(@RequestBody Empleado empleado, @PathVariable("id") Long id);

    @DeleteMapping("/delete/{id}")
    String eliminarEmpleado(@PathVariable("id") int id);
}
