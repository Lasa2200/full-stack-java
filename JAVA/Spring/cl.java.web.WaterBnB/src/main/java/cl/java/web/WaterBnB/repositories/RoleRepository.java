package cl.java.web.WaterBnB.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.java.web.WaterBnB.models.Role;



@Repository
public interface RoleRepository extends CrudRepository<Role, Long>{
	
	Role findRoleByName(String role);
}