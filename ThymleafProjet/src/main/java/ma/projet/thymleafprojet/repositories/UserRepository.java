package ma.projet.thymleafprojet.repositories;

import ma.projet.thymleafprojet.entitites.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}


