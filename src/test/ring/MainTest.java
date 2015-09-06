package test.ring;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ring.common.Dictionary;
import ring.service.UserRoleService;
import ring.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:config/spring/ring-context.xml" })  
public class MainTest {
	
	@Autowired
	UserService userService;
	
	@Autowired
	UserRoleService userRoleService;
	
	@Test
	public void test() {
		try {
//			System.out.println(userService.findByUserNameAndUserPass("zhangtao", "000000"));
			System.out.println(userRoleService.findByUserIdAndStatus(1L, Dictionary.STATUS_NORMAL));
//			System.out.println(new BASE64Encoder().encode("000000".getBytes("utf-8")).toLowerCase());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
