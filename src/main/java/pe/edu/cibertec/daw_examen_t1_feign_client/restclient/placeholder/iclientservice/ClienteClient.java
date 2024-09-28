package pe.edu.cibertec.daw_examen_t1_feign_client.restclient.placeholder.iclientservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.daw_examen_t1_feign_client.restclient.placeholder.model.Cliente;

import java.util.List;

@FeignClient(name = "clienteClient", url = "http://localhost:8080/cliente")
public interface ClienteClient {

    @GetMapping("/findAll")
    List<Cliente> obtenerTodosLosClientes();

    @GetMapping("/find/{id}")
    Cliente obtenerClientePorId(@PathVariable("id") Long id);

    @PostMapping("/create")
    Cliente crearCliente(@RequestBody Cliente cliente);

    @PutMapping("/update/{id}")
    Cliente actualizarCliente(@RequestBody Cliente cliente, @PathVariable("id") Long id);

    @DeleteMapping("/delete/{id}")
    String eliminarCliente(@PathVariable("id") Long id);

}