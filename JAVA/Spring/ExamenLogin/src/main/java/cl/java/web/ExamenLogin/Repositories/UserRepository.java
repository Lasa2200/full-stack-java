package cl.java.web.ExamenLogin.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.java.web.ExamenLogin.Models.User;

@Repository
	public interface UserRepository extends CrudRepository<User, Long> {
	    User findByEmail(String email);
	}

