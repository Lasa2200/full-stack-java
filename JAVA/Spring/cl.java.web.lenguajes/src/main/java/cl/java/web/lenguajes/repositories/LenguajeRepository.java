package cl.java.web.lenguajes.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.java.web.lenguajes.models.LenguajeModel.Lenguaje;
@Repository
public interface LenguajeRepository  extends CrudRepository<Lenguaje,Long>{

//Este método recupera todos los lenguajes de la base de datos
List<Lenguaje> findAll();
////Este método encuentra un lenguaje por su creador
List<Lenguaje> findByCreatorContaining(String search);
////Este método cuenta cuántos libros contiene cierta cadena en el título
//Long countByTitleContaining(String search);
//////Este método borra un lenguaje por su nombre
//Long deleteByLenguajeStartingWith(String search);
//void deleteById(Long id);
}