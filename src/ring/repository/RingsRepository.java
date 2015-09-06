package ring.repository;

import org.springframework.stereotype.Repository;

import ring.entity.db.Group;
import ring.repository.suppor.SuperRepository;
@Repository
public interface RingsRepository extends SuperRepository<Group, Long> {

}
