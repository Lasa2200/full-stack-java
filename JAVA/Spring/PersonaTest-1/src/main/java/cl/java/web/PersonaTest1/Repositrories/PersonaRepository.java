package cl.java.web.PersonaTest1.Repositrories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.java.web.PersonaTest1.Models.Persona;

@Repository
public interface PersonaRepository extends CrudRepository <Persona,Long>{

	List<Persona> findAll();
}
