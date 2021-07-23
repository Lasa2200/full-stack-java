package cl.java.web.WaterBnB.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	
     cl.java.web.WaterBnB.models.User findByEmail(String email);

	void save(cl.java.web.WaterBnB.models.User user);
}


