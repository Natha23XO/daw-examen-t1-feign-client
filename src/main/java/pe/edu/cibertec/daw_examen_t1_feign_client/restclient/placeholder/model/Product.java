package pe.edu.cibertec.daw_examen_t1_feign_client.restclient.placeholder.model;
import lombok.Data;

@Data
public class Product {
    private int id;
    private String title;
    private double price;
    private String description;
    private String category;
    private String image;

}