package com.spring.security.example.SpringApp.User.Repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.security.example.SpringApp.User.Model.UserModel;
import com.spring.security.example.SpringApp.User.Model.UserRole;

@Repository
public interface UserRoleRepository extends CrudRepository<UserModel, Long> {
	public Optional<UserRole> findByUsername(String name);
}
