package main.java.com.campusland.repository;

import java.util.List;

import com.campusland.repository.models.Cliente;

public interface CrudRepositoryCliente {

    List<Cliente> lista();
    //Buscar
    Cliente porDocumento(String documento);

    void crear(Cliente cliente);

    void editar(Cliente cliente);

    void eliminar(String id);
}
