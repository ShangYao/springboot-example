package com.example.es.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.es.domain.User;
import com.example.es.rep.UserRep;

/**
 * 
 * @description
 * @author shangyao
 * @date 2018年3月23日
 */
@RestController
public class EsController {
	@Autowired
	private UserRep userRep;

	@RequestMapping("/hello")
	public String hello() {
		return "hello world";
	}

	@RequestMapping("/get/{id}")
	public User get(@PathVariable("id") long id) {
		Optional<User> o = userRep.findById(id);
		return o.get();
	}

	@RequestMapping("/getAll")
	public Iterable<User> getAll() {
		return userRep.findAll();
	}

	@RequestMapping("/delete/{id}")
	public void delete(@PathVariable("id") long id) {
		userRep.deleteById(id);
	}

	@RequestMapping("/add")
	public User add() {
		User user = userRep.save(new User(1, "jay"));
		userRep.save(new User(2, "curry"));
		userRep.save(new User(3, "json"));
		userRep.save(new User(4, "jet"));
		return user;
	}
}
