package cl.java.web.ListaDeEstudiantes.Repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import cl.java.web.ListaDeEstudiantes.Model.Person;

public interface PersonRepository extends CrudRepository<Person,Long> {
	ArrayList<Person> findAll();
}
