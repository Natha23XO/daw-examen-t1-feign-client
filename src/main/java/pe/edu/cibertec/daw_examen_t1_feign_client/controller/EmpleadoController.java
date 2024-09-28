package pe.edu.cibertec.daw_examen_t1_feign_client.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.daw_examen_t1_feign_client.restclient.placeholder.model.Empleado;
import pe.edu.cibertec.daw_examen_t1_feign_client.service.EmpleadoService;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class EmpleadoController {
    private final EmpleadoService empleadoService;

    @GetMapping("/empleados")
    public List<Empleado> obtenerEmpleados() {
        return empleadoService.obtenerEmpleados();
    }
}
