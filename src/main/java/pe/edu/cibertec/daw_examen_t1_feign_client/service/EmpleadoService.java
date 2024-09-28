package pe.edu.cibertec.daw_examen_t1_feign_client.service;


import org.springframework.stereotype.Service;
import pe.edu.cibertec.daw_examen_t1_feign_client.restclient.placeholder.model.Empleado;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpleadoService {

    public List<Empleado> obtenerEmpleados() {
        List<Empleado> empleados = new ArrayList<>();

        Empleado empleado1 = new Empleado();
        empleado1.setId(1);
        empleado1.setNombre("Hugo Nathanael");
        empleado1.setApellido("Castro Leon");
        empleado1.setPuesto("Desarrollador Web");

        Empleado empleado2 = new Empleado();
        empleado2.setId(2);
        empleado2.setNombre("Genesis Giovanna");
        empleado2.setApellido("Despoux Arica");
        empleado2.setPuesto("Analista de Datos");

        Empleado empleado3 = new Empleado();
        empleado2.setId(3);
        empleado2.setNombre("Patrick Alexander");
        empleado2.setApellido("Montes de Oca");
        empleado2.setPuesto("Ingeniero de Datos");

        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(empleado3);

        return empleados;
    }
}
