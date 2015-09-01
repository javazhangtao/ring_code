package ring.repository;

import org.springframework.stereotype.Repository;

import ring.entity.db.Model;
import ring.repository.suppor.SuperRepository;
@Repository
public interface ModelRepository extends SuperRepository<Model, Long> {

}
