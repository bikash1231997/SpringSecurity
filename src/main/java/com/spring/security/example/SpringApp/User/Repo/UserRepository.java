package com.spring.security.example.SpringApp.User.Repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.security.example.SpringApp.User.Model.UserModel;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Long> {
	public Optional<UserModel> findByUsername(String name);
}
