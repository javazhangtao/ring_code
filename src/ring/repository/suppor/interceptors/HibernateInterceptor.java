package ring.repository.suppor.interceptors;

import org.apache.log4j.Logger;
import org.hibernate.EmptyInterceptor;

/**
 *	hibernate 拦截器
 */
public class HibernateInterceptor extends EmptyInterceptor{
	
	private static final long serialVersionUID = -5465103336597146474L;
	
	Logger logger=Logger.getLogger(HibernateInterceptor.class);

	@Override
	public String onPrepareStatement(String sql) {
		return super.onPrepareStatement(sql);
	}
}
