package ring.repository;

import org.springframework.stereotype.Repository;

import ring.entity.db.Mold;
import ring.repository.suppor.SuperRepository;

@Repository
public interface MoldRepository extends SuperRepository<Mold, Long> {

}
