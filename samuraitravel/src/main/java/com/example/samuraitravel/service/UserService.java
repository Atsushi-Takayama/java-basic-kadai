package com.example.samuraitravel.service;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.samuraitravel.entity.Role;
import com.example.samuraitravel.entity.User;
import com.example.samuraitravel.form.SignupForm;
import com.example.samuraitravel.repository.RoleRepository;
import com.example.samuraitravel.repository.UserRepository;
@Service
public class UserService {
  private final UserRepository userRepository;
  private final RoleRepository roleRepository;
  private final PasswordEncoder passwordEncoder;
  
  public UserService(UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
	  this.userRepository = userRepository;
	  this.roleRepository = roleRepository; 
	  this.passwordEncoder = passwordEncoder;
  }
  
  @Transactional
  public User create(SignupForm signupForm) {
	  User user = new User();
	  Role role = roleRepository.findByName("ROLE_GENERAL");
	  
	  user.setName(signupForm.getName());
	  user.setFurigana(signupForm.getFurigana());
	  user.setPostalCode(signupForm.getPostalCode());
	  user.setAddress(signupForm.getAddress());
	  user.setPhoneNumber(signupForm.getPhoneNumber());
	  user.setEmail(signupForm.getEmail());
	  user.setPassword(passwordEncoder.encode(signupForm.getPassword()));
	  user.setRole(role);
	  user.setEnabled(true); 
	  
	  return userRepository.save(user);
  }
  
  public boolean isEmailRegistered(String email) {
	  User user = userRepository.findByEmail(email);
	  return user != null;
  }
  
  public boolean isSamePassword(String password,String passwordConfirmation) {
	  return password.equals(passwordConfirmation);
  }
}
