package com.corhuila.biblioteca.IRepository;

import com.corhuila.biblioteca.Document.Autor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAutorRepository extends MongoRepository<Autor, String> {
}
