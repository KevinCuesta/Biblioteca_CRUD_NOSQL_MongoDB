package com.corhuila.biblioteca.Document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document(collection = "libro")
public class Libro {

    @Id
    private String id;
    @Field
    private String titulo;

    @Field
    private String isbn;

    @Field
    private String genero;

    @Field
    private Integer aniopublicacion;

    @Field
    private String sinopsis;

    @DBRef
    private Autor autor;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getAniopublicacion() {
        return aniopublicacion;
    }

    public void setAniopublicacion(Integer aniopublicacion) {
        this.aniopublicacion = aniopublicacion;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

}