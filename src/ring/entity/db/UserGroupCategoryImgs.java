package ring.entity.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ring.common.Dictionary;
import ring.entity.SuperEntity;

@Entity
@Table(name="ring_user_group_category_imgs")
public class UserGroupCategoryImgs extends SuperEntity {
	private static final long serialVersionUID = 1593373408608301674L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name="ugc_id")
	private UserGroupCategory userGroupCategory;
	@Column(name="img_url")
	private String imgUrl;
	@Column(name="priority")
	private Integer priority;
	@Column(name="status")
	private int status=Dictionary.STATUS_BLOCK;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public UserGroupCategory getUserGroupCategory() {
		return userGroupCategory;
	}
	public void setUserGroupCategory(UserGroupCategory userGroupCategory) {
		this.userGroupCategory = userGroupCategory;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}
