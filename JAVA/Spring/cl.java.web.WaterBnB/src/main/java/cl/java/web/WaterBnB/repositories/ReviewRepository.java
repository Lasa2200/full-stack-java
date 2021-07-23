package cl.java.web.WaterBnB.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.java.web.WaterBnB.models.Review;


@Repository
public interface ReviewRepository extends CrudRepository<Review, Long>{

}
