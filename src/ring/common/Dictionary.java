package ring.common;

import java.util.Date;

/**
 *	产量变量
 */
public class Dictionary {

	
	/**
	 *   状态变量
	 */
	public final static int STATUS_BLOCK=0;//禁用
	public final static int STATUS_NORMAL=1;//正常
	
	public final static int INIT_USER_LEVEL=1;//用户初始等级
	
	public final static long CURRENT_LONG_TIME=new Date().getTime()/1000;//当前时间戳
	
	/**
	 * 	系统操作权限
	 */
	public final static Integer ROLE_BROWSE=4;//浏览
	public final static Integer ROLE_ADD=3;//新增
	public final static Integer ROLE_UPDATE=2;//修改
	public final static Integer ROLE_DELETE=1;//删除
	public final static Integer ROLE_SUPER=0;//超级权限
}
