package com.coder911.coder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coder911.coder.entity.Coder;

@Repository
public interface CoderRepository extends JpaRepository<Coder, Integer>{

	Coder findByEmailAndPassword(String email, String password);

	Coder findByEmail(String email);

}
