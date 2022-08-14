package net.javaguides.springboot.model;


import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="leaveType")
public class LeaveType {

	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="Leave_type_id")
	private long id;

	
	private String leaveTitle ;
	
	@OneToMany(fetch=FetchType.EAGER,mappedBy="leaveType")
	@JsonIgnore
	private List<LeaveRequest> leaveRequests;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLeaveTitle() {
		return leaveTitle;
	}

	public void setLeaveTitle(String leaveTitle) {
		this.leaveTitle = leaveTitle;
	}

	public List<LeaveRequest> getLeaveRequests() {
		return leaveRequests;
	}

	public void setLeaveRequests(List<LeaveRequest> leaveRequests) {
		this.leaveRequests = leaveRequests;
	}
	
	
}
