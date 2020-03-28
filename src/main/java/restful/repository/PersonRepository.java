package restful.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import restful.domain.Person;


@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
}
