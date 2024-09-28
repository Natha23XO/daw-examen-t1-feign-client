package pe.edu.cibertec.daw_examen_t1_feign_client.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.daw_examen_t1_feign_client.restclient.placeholder.model.Empleado;
import pe.edu.cibertec.daw_examen_t1_feign_client.service.EmpleadoService;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class EmpleadoController {

    private final EmpleadoService empleadoService;

    @GetMapping("/empleado/findAll")
    public ResponseEntity<List<Empleado>> findAll() {
        List<Empleado> empleados = empleadoService.findAll();
        return new ResponseEntity<>(empleados, HttpStatus.OK);
    }

    @GetMapping("/empleado/{id}")
    public ResponseEntity<Empleado> findById(@PathVariable int id) {
        Empleado empleado = empleadoService.findById(id);
        return new ResponseEntity<>(empleado, HttpStatus.OK);
    }

    @PostMapping("/empleado/create")
    public ResponseEntity<Empleado> create(@RequestBody Empleado empleado) {
        Empleado empleadoNuevo = empleadoService.create(empleado);
        return new ResponseEntity<>(empleadoNuevo, HttpStatus.CREATED);
    }

    @PutMapping("/empleado/update/{id}")
    public ResponseEntity<Empleado> update(@PathVariable Long id, @RequestBody Empleado empleado) {
        Empleado empleadoAc = empleadoService.update(empleado, id);
        return new ResponseEntity<>(empleadoAc, HttpStatus.OK);
    }

    @DeleteMapping("/empleado/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        String mensaje = empleadoService.delete(id);
        return new ResponseEntity<>(mensaje, HttpStatus.OK);
    }

}
