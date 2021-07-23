package cl.java.web.examenB.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.java.web.examenB.models.User;

@Repository
public interface UserRepository  extends CrudRepository <User,Long>{
User findByEmail(String email);
}
