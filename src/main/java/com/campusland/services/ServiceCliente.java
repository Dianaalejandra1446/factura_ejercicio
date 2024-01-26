package main.java.com.campusland.services;

import java.util.List;

import com.campusland.repository.models.Cliente;

public interface ServiceCliente {
    
    List<Cliente> listar();
    Cliente porDocumento(String documento) throws ClienteException;
    void crear(Cliente ciente);
    void editar(Cliente cliente);
    void eliminar(String id);
}
