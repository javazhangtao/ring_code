package ring.repository;

import org.springframework.stereotype.Repository;

import ring.entity.db.User;
import ring.repository.suppor.SuperRepository;

@Repository
public interface UserRepository extends SuperRepository<User, Long> {

	User findOneByUserNameAndUserPass(final String userName , final String userPass);
}
