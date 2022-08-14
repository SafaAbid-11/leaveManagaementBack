package net.javaguides.springboot.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Entity
@Table(name="leaveRequest")
public class LeaveRequest {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	
	private Date startDate ;
	
	
	private Date endDate ;
	
	@CreationTimestamp
	@Column(updatable=false)
	private java.sql.Timestamp creationDate ;
	
	private int nbjAbs;
	private String leaveDesc ;
	 private String status;
	 
	
	@ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "Leave_type_id")
    private LeaveType leaveType;

	@ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "collaborator_id")
    private Collaborator collaborator;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public java.sql.Timestamp getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(java.sql.Timestamp creationDate) {
		this.creationDate = creationDate;
	}

	public String getLeaveDesc() {
		return leaveDesc;
	}

	public void setLeaveDesc(String leaveDesc) {
		this.leaveDesc = leaveDesc;
	}


	public LeaveType getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(LeaveType leaveType) {
		this.leaveType = leaveType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Collaborator getCollaborator() {
		return collaborator;
	}

	public void setCollaborator(Collaborator collaborator) {
		this.collaborator = collaborator;
	}

	public int getNbjAbs() {
		return nbjAbs;
	}

	public void setNbjAbs(int nbjAbs) {
		this.nbjAbs = nbjAbs;
	}

	
	
	
}
