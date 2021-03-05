package cl.java.web.WaterBnB.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository  extends CrudRepository<User, Long>{
	
}


