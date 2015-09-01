package ring.repository;

import org.springframework.stereotype.Repository;

import ring.entity.db.Function;
import ring.repository.suppor.SuperRepository;
@Repository
public interface FunctionRepository extends SuperRepository<Function, Long> {

}
