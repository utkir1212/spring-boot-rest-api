package restful.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import restful.domain.BaseEntity;

@Repository
public interface BaseRepository<E extends BaseEntity, I extends Long>  extends CrudRepository<E, I> {
}
