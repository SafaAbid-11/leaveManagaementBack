package net.javaguides.springboot.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="collaborator")
public class Collaborator {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	 
	 @Column(nullable=false)
	private int  cin;
	 
	private String firstName;
	
	private String lastName; 
	 
	private String respo ;
	 private String login;
	private String password;
	
		private String address ;
		
		@CreationTimestamp
		@Column(updatable=false)
		private java.sql.Timestamp StartDate ;
		
		private Date BirthDate  ;
		
		 private boolean enabled;
		 
		 private String[] roles;
		 
		 private String image;
		 
		 private String PhoneNumber;
		 
		 private Number yearsOfExp;
		 
		 private String notes;
		 
		 private Date deletedAt;
		 
		 private float sickBalance;
		 private float earnedBalance;
		 
		 
		 @OneToMany(fetch=FetchType.EAGER,mappedBy="collaborator")
		 @JsonIgnore
			private List<LeaveRequest> leaveRequests;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public int getCin() {
			return cin;
		}

		public void setCin(int cin) {
			this.cin = cin;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getRespo() {
			return respo;
		}

		public void setRespo(String respo) {
			this.respo = respo;
		}

		public String getLogin() {
			return login;
		}

		public void setLogin(String login) {
			this.login = login;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public java.sql.Timestamp getStartDate() {
			return StartDate;
		}

		public void setStartDate(java.sql.Timestamp startDate) {
			StartDate = startDate;
		}

		public Date getBirthDate() {
			return BirthDate;
		}

		public void setBirthDate(Date birthDate) {
			BirthDate = birthDate;
		}

		public boolean isEnabled() {
			return enabled;
		}

		public void setEnabled(boolean enabled) {
			this.enabled = enabled;
		}

		public List<LeaveRequest> getLeaveRequests() {
			return leaveRequests;
		}

		public void setLeaveRequests(List<LeaveRequest> leaveRequests) {
			this.leaveRequests = leaveRequests;
		}

		public String[] getRoles() {
			return roles;
		}

		public void setRoles(String[] roles) {
			this.roles = roles;
		}

		public String getImage() {
			return image;
		}

		public void setImage(String image) {
			this.image = image;
		}

		public String getPhoneNumber() {
			return PhoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			PhoneNumber = phoneNumber;
		}

		public Number getYearsOfExp() {
			return yearsOfExp;
		}

		public void setYearsOfExp(Number yearsOfExp) {
			this.yearsOfExp = yearsOfExp;
		}

		public String getNotes() {
			return notes;
		}

		public void setNotes(String notes) {
			this.notes = notes;
		}

		public Date getDeletedAt() {
			return deletedAt;
		}

		public void setDeletedAt(Date deletedAt) {
			this.deletedAt = deletedAt;
		}

		public float getSickBalance() {
			return sickBalance;
		}

		public void setSickBalance(float sickBalance) {
			this.sickBalance = sickBalance;
		}

		public float getEarnedBalance() {
			return earnedBalance;
		}

		public void setEarnedBalance(float earnedBalance) {
			this.earnedBalance = earnedBalance;
		}
		 
}
