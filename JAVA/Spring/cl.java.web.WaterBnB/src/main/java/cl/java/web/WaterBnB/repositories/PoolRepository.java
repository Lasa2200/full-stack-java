package cl.java.web.WaterBnB.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.java.web.WaterBnB.models.Pool;

@Repository
public interface PoolRepository extends CrudRepository<Pool, Long>{
	
	List<Pool> findByAddressContaining(String addres);
}