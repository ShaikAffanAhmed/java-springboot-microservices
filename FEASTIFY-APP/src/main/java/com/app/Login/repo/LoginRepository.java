package com.app.Login.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Login.entity.LoginPage;

public interface LoginRepository  extends JpaRepository<LoginPage, String> {
	


}
