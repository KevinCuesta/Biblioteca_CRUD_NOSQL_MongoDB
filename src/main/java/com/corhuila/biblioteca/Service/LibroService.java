package com.corhuila.biblioteca.Service;

import com.corhuila.biblioteca.Document.Libro;
import com.corhuila.biblioteca.IRepository.ILibroRepository;
import com.corhuila.biblioteca.IService.ILibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroService implements ILibroService {

    //Conectar con los datos - IRepository
    // Inyección de dependencia
    @Autowired
    private ILibroRepository repository;


    @Override
    public List<Libro> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Libro> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Libro save(Libro libro) {
        return repository.save(libro);
    }

    @Override
    public void update(Libro libro, String id) {
        //Obtener el objeto cliente y el id
        //Verificar con el id, si exiten los datos
        Optional<Libro> ps = repository.findById(id);

        //Cargar nuevo objeto
        if (!ps.isEmpty()){
            Libro libroUpdate = ps.get();
            libroUpdate.setTitulo(libro.getTitulo());
            libroUpdate.setIsbn(libro.getIsbn());
            libroUpdate.setGenero(libro.getGenero());
            libroUpdate.setAniopublicacion(libro.getAniopublicacion());
            libroUpdate.setSinopsis(libro.getSinopsis());
            libroUpdate.setAutor(libro.getAutor());

            //Actualizar el objeto cliente
            repository.save(libroUpdate);
        }else{
            System.out.println("No existe el cliente");
        }
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}
