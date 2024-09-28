package pe.edu.cibertec.daw_examen_t1_feign_client.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.daw_examen_t1_feign_client.restclient.placeholder.model.Cliente;
import pe.edu.cibertec.daw_examen_t1_feign_client.service.ClienteService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService clienteService;


    @GetMapping("/cliente/findAll")
    public ResponseEntity<List<Cliente>> findAll() {
        List<Cliente> clientes = clienteService.findAll();
        return new ResponseEntity<>(clientes, HttpStatus.OK);
    }


    @GetMapping("/cliente/{id}")
    public ResponseEntity<Cliente> findById(@PathVariable Long id) {
        Cliente cliente = clienteService.findById(id);
        return new ResponseEntity<>(cliente, HttpStatus.OK);
    }


    @PostMapping("/cliente/create")
    public ResponseEntity<Cliente> create(@RequestBody Cliente cliente) {
        Cliente nuevoCliente = clienteService.create(cliente);
        return new ResponseEntity<>(nuevoCliente, HttpStatus.CREATED);
    }


    @PutMapping("/cliente/update/{id}")
    public ResponseEntity<Cliente> update(@PathVariable Long id, @RequestBody Cliente cliente) {
        Cliente clienteActualizado = clienteService.update(cliente, id);
        return new ResponseEntity<>(clienteActualizado, HttpStatus.OK);
    }


    @DeleteMapping("/cliente/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        String mensaje = clienteService.delete(id);
        return new ResponseEntity<>(mensaje, HttpStatus.OK);
    }

}
