package cl.java.web.Relationships2.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.java.web.Relationships2.Models.Person;


@Repository
public interface PersonRepository  extends CrudRepository<Person,Long>{

}
