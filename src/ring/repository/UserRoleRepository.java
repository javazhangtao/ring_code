package ring.repository;

import org.springframework.stereotype.Repository;

import ring.entity.db.UserRole;
import ring.repository.suppor.SuperRepository;

@Repository
public interface UserRoleRepository extends SuperRepository<UserRole, Long>{

	UserRole findOneByUserIdAndStatus(final Long userId , final Integer status);
}
