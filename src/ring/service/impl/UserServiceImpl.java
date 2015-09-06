package ring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ring.entity.db.User;
import ring.repository.UserRepository;
import ring.service.SuperService;
import ring.service.UserService;
import sun.misc.BASE64Encoder;

@Service("userService")
public class UserServiceImpl extends SuperService implements UserService {

	@Autowired
	UserRepository userRepository;
	
	public User findByUserNameAndUserPass(String userName, String userPass) {
		try {
			return userRepository.findOneByUserNameAndUserPass(userName, new BASE64Encoder().encode(userPass.getBytes("utf-8")).toLowerCase());
		} catch (Exception e) {
			return null ;
		}
	}

}
