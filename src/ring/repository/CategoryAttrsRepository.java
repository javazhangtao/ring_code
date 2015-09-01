package ring.repository;

import org.springframework.stereotype.Repository;

import ring.entity.db.CategoryAttrs;
import ring.repository.suppor.SuperRepository;

@Repository
public interface CategoryAttrsRepository extends SuperRepository<CategoryAttrs, Long> {

}
