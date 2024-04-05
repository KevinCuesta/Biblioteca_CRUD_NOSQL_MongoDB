package com.corhuila.biblioteca.Service;

import com.corhuila.biblioteca.Document.Autor;
import com.corhuila.biblioteca.IRepository.IAutorRepository;
import com.corhuila.biblioteca.IService.IAutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService implements IAutorService {

    //Conectar con los datos - IRepository
    // Inyección de dependencia
    @Autowired
    private IAutorRepository repository;


    @Override
    public List<Autor> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Autor> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Autor save(Autor cliente) {
        return repository.save(cliente);
    }

    @Override
    public void update(Autor autor, String id) {
        //Obtener el objeto cliente y el id
        //Verificar con el id, si exiten los datos
        Optional<Autor> ps = repository.findById(id);

        //Cargar nuevo objeto
        if (!ps.isEmpty()){
            Autor autorUpdate = ps.get();
            autorUpdate.setNombre(autor.getNombre());
            autorUpdate.setApellido(autor.getApellido());
            autorUpdate.setFechanacimiento(autor.getFechanacimiento());
            autorUpdate.setBiografia(autor.getBiografia());

            //Actualizar el objeto cliente
            repository.save(autorUpdate);
        }else{
            System.out.println("No existe el cliente");
        }
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}
