package com.corhuila.biblioteca.IService;

import com.corhuila.biblioteca.Document.Autor;

import java.util.List;
import java.util.Optional;

public interface IAutorService {
    List<Autor> findAll(); // Devuelve una lista de clientes
    Optional<Autor> findById(String id); // Devuelve un cliente por su id
    Autor save(Autor autor); // Guarda un cliente
    void update(Autor autor, String id); // Actualiza un cliente
    void delete(String id); // Elimina un cliente
}
