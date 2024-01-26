package com.campusland.repository.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//get and setters
@AllArgsConstructor //Llamar al constructor
@NoArgsConstructor 
public class Cliente {
    
    private String nombre;
    private String apellido;
    private String email;
    private String direccion;
    private String celular;
    private String documento;

    public String getFullName(){
        return this.nombre + " "+ this.apellido;
    }
}
