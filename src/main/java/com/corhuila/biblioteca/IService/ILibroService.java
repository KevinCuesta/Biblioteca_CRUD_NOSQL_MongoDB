package com.corhuila.biblioteca.IService;

import com.corhuila.biblioteca.Document.Libro;

import java.util.List;
import java.util.Optional;

public interface ILibroService {
    List<Libro> findAll(); // Devuelve una lista de clientes
    Optional<Libro> findById(String id); // Devuelve un cliente por su id
    Libro save(Libro libro); // Guarda un cliente
    void update(Libro libro, String id); // Actualiza un cliente
    void delete(String id); // Elimina un cliente
}
