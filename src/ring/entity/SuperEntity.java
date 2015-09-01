package ring.entity;

import java.io.Serializable;

import javax.persistence.Column;

import ring.common.Dictionary;

public class SuperEntity implements Serializable{

	private static final long serialVersionUID = 5084498305663099200L;
	
	@Column(name="create_time")
	private Long  createTime;
	
	public Long getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Long createTime) {
		this.createTime = (null==createTime)?Dictionary.CURRENT_LONG_TIME:createTime;
	}
	

}
