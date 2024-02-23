package com.spring.security.example.SpringApp.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.spring.security.example.SpringApp.User.Model.UserModel;
import com.spring.security.example.SpringApp.User.Repo.UserRepository;

@Service
public class UserDetalsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserModel user = userRepository.findByUsername(username)
				.orElseThrow(() -> new UsernameNotFoundException(username));
		return new CustomUserDetails(user);
	}
}
