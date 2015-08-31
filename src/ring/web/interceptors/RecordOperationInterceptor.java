package ring.web.interceptors;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class RecordOperationInterceptor implements HandlerInterceptor{
	Logger logger=Logger.getLogger(RecordOperationInterceptor.class);

	public void afterCompletion(final HttpServletRequest request, final HttpServletResponse response, final Object obj, final Exception e)
            throws Exception {
    }
    
    public void postHandle(final HttpServletRequest request, final HttpServletResponse response,
            final Object obj, final ModelAndView model) throws Exception {
    }

    public boolean preHandle(final HttpServletRequest request, final HttpServletResponse response,final Object obj) throws Exception {
    	String url=request.getServletPath().toString();
    	Enumeration<String> paramNames=request.getParameterNames();
    	final StringBuffer params=new StringBuffer();
    	while (paramNames.hasMoreElements()) {
			final String paramName = (String) paramNames.nextElement();
			final String paramValue=request.getParameter(paramName);
			params.append(paramName+"="+paramValue);
			if(paramNames.hasMoreElements()){
				params.append(",");
			}
		}
    	logger.debug("URL :"+url+",IP :"+request.getRemoteAddr()+",INFO :"+params.toString());
    	return true;
    }
}
