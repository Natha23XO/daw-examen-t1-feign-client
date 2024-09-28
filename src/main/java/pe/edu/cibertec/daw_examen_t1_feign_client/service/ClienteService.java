package pe.edu.cibertec.daw_examen_t1_feign_client.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.daw_examen_t1_feign_client.restclient.placeholder.iclientservice.ClienteClient;
import pe.edu.cibertec.daw_examen_t1_feign_client.restclient.placeholder.model.Cliente;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteClient clienteClient;


    public List<Cliente> findAll() {
        return clienteClient.obtenerTodosLosClientes();
    }


    public Cliente findById(Long id) {
        return clienteClient.obtenerClientePorId(id);
    }


    public Cliente create(Cliente cliente) {
        return clienteClient.crearCliente(cliente);
    }


    public Cliente update(Cliente cliente, Long id) {
        return clienteClient.actualizarCliente(cliente, id);
    }


    public String delete(Long id) {
        return clienteClient.eliminarCliente(id);
    }

}
