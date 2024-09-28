package pe.edu.cibertec.daw_examen_t1_feign_client.restclient.placeholder.iclientservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.daw_examen_t1_feign_client.restclient.placeholder.model.Product;


@FeignClient(name = "productClient", url = "https://fakestoreapi.com")
public interface ProductClient {

    @GetMapping("/products/{id}")
    Product obtenerProductoXid(@PathVariable("id") Long id);

    @PostMapping("/products")
    Product crearProducto(@RequestBody Product producto);
}

