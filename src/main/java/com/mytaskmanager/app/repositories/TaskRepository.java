package com.mytaskmanager.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mytaskmanager.app.entities.Tasks;



@Repository
public interface TaskRepository extends JpaRepository<Tasks,Long>
{
	

}
