package pe.edu.cibertec.daw_examen_t1_feign_client.restclient.placeholder.model;

import lombok.Data;

@Data
public class Cliente {
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String direccion;
}
