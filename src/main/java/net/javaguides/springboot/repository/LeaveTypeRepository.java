package net.javaguides.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.LeaveType;

@Repository
public interface LeaveTypeRepository  extends JpaRepository<LeaveType, Long> {

	 @Query( "select t  from LeaveType t where lower(t.leaveTitle) like lower(:leaveTitle)")
	 LeaveType findByTitle(@Param("leaveTitle") String leaveTitle);
	

}
