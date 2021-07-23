package cl.java.web.ExamenA.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.java.web.ExamenA.models.User;

@Repository
public interface UserRepository  extends CrudRepository<User, Long>{
	User findByEmail(String email);
}