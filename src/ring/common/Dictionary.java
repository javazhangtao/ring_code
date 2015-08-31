package ring.common;

import java.util.Date;

/**
 *	静�?变量
 */
public class Dictionary {

	
	/**
	 *   状�?变量
	 */
	public final static int STATUS_BLOCK=0;//禁用
	public final static int STATUS_NORMAL=1;//正常
	
	public final static int INIT_USER_LEVEL=1;//用户初始等级
	
	public final static long CURRENT_LONG_TIME=new Date().getTime()/1000;//当前时间�?
	
	/**
	 * 	系统操作权限
	 */
	public final static String ROLE_BROWSE="browse";//浏览
	public final static String ROLE_ADD="add";//新增
	public final static String ROLE_DELETE="delete";//删除
	public final static String ROLE_UPDATE="update";//修改
	public final static String ROLE_SUPER="super";//超级权限
	
}
