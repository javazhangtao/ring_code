package ring.service;

import ring.entity.db.User;

public interface UserService {

	User findByUserNameAndUserPass(final String userName , final String userPass);
}
