package com.coder911.coder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.coder911.coder.entity.Coder;
import com.coder911.coder.entity.CoderId;

@Repository
public interface CoderRepository extends JpaRepository<Coder, CoderId>{

	@Query("SELECT c FROM Coder c WHERE c.id.email = :email")
	Coder findByEmail(@Param("email") String email);

	@Query("SELECT c FROM Coder c WHERE c.id.email = :email AND c.id.password = :password")
	Coder findByEmailAndPassword(@Param("email") String email, @Param("password") String password);

}
