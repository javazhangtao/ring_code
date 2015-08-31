package ring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ring.entity.db.User;
import ring.repository.UserRepository;
import ring.service.SuperService;
import ring.service.UserService;

@Service("userService")
public class UserServiceImpl extends SuperService implements UserService {

	@Autowired
	UserRepository userRepository;
	
	public void saveUser(final User user){
		this.userRepository.save(user);
	}
}
