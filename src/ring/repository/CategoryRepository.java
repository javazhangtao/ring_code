package ring.repository;

import org.springframework.stereotype.Repository;

import ring.entity.db.Category;
import ring.repository.suppor.SuperRepository;

@Repository
public interface CategoryRepository extends SuperRepository<Category, Long>{
}
