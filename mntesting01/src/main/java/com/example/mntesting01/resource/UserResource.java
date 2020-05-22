package com.example.mntesting01.resource;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mntesting01.model.Users;
import com.example.mntesting01.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserResource {

	@Autowired
	private UserRepository userRepo;
	
	@PostMapping
	public ResponseEntity<Users> pushUser(@RequestBody Users users) {
		users.setMyId(UUID.randomUUID());
		return new ResponseEntity<>(userRepo.save(users), HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<Page<Users>> pullUsers(Pageable page) {
		return new ResponseEntity<>(userRepo.findAll(page), HttpStatus.OK);
	}
}
