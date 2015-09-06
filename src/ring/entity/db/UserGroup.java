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
@Table(name="ring_user_group")
public class UserGroup extends SuperEntity {
	private static final long serialVersionUID = 5214010125485722548L;
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name="group_id")
	private Group group;
	@ManyToOne
	@JoinColumn(name="mold_id")
	private Mold mold;
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	@Column(name="status")
	private int status=Dictionary.STATUS_BLOCK;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Mold getMold() {
		return mold;
	}
	public void setMold(Mold mold) {
		this.mold = mold;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Group getGroup() {
		return group;
	}
	public void setGroup(Group group) {
		this.group = group;
	}

}
