package pe.edu.cibertec.daw_examen_t1_feign_client.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.daw_examen_t1_feign_client.restclient.placeholder.iclientservice.ProductClient;
import pe.edu.cibertec.daw_examen_t1_feign_client.restclient.placeholder.model.Product;


@RequiredArgsConstructor
@Service
public class ProductService {
    private final ProductClient ProductClient;

    public Product obtenerProductoXid(Long id){
        return ProductClient.obtenerProductoXid(id);
    }
    public Product crearProducto(Product producto){
        return ProductClient.crearProducto(producto);
    }
}
