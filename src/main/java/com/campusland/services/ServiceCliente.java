package main.java.com.campusland.services;

import java.util.List;
import com.campusland.repository.models.Cliente;
//src\main\java\com\campusland\exceptiones\clienteExcepciones\ClienteNullException.java
import com.campusland.exceptiones.clienteExcepciones.ClienteNullException;
public interface ServiceCliente {
    
    List<Cliente> listar();
    Cliente porDocumento(String documento) throws ClienteNullException;
    void crear(Cliente cliente);
    void editar(Cliente cliente);
    void eliminar(String id);
}

