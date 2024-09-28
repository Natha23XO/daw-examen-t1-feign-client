package pe.edu.cibertec.daw_examen_t1_feign_client.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.daw_examen_t1_feign_client.restclient.placeholder.model.Product;
import pe.edu.cibertec.daw_examen_t1_feign_client.service.ProductService;

@RequiredArgsConstructor
@RestController
public class ProductController {
    private final ProductService productService;

    @GetMapping("/producto/{id}")
    public Product obtenerProductoXid(@PathVariable("id") Long id){
        return productService.obtenerProductoXid(id);
    }

    @PostMapping("/producto")
    public Product crearProducto(@RequestBody Product producto){
        return productService.crearProducto(producto);
    }
}