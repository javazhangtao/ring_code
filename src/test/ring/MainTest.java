package test.ring;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:config/spring/ring-context.xml" })  
public class MainTest {
	
	@Test
	public void test() {
		try {
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
