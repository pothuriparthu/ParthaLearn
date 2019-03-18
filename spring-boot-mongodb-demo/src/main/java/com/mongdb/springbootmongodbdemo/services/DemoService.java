/**
 * 
 */
package com.mongdb.springbootmongodbdemo.services;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mongdb.springbootmongodbdemo.model.Users;
import com.mongdb.springbootmongodbdemo.repository.UsersRepository;

/**
 * @author papothur
 *
 */
@RestController
@RequestMapping("/rest/demoService")
public class DemoService {

	private UsersRepository usersRepository;

	/**
	 * @param usersRepository
	 */
	public DemoService(UsersRepository usersRepository) {
		this.usersRepository = usersRepository;
	}

	@GetMapping("/all")
	public @ResponseBody List<Users> getAll() {
		return usersRepository.findAll();
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public @ResponseBody Users insert(@RequestBody Users user) {

		user = usersRepository.insert(user);
		return user;
	}

}
