package com.corhuila.biblioteca.IRepository;

import com.corhuila.biblioteca.Document.Libro;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILibroRepository extends MongoRepository<Libro, String> {
}
