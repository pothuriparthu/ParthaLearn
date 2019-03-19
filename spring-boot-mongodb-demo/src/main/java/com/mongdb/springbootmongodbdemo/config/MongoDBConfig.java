/**
 * 
 */
package com.mongdb.springbootmongodbdemo.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongdb.springbootmongodbdemo.model.Users;
import com.mongdb.springbootmongodbdemo.repository.UsersRepository;

/**
 * @author papothur
 *
 */

@EnableMongoRepositories(basePackageClasses = UsersRepository.class)
@Configuration
public class MongoDBConfig {

	/*@Bean
	CommandLineRunner commandLineRunner(UsersRepository usersRepository) {
		return new CommandLineRunner() {

			@Override
			public void run(String... args) throws Exception {

				usersRepository.save(new Users(1, "Partha", "Development", 3000L));
				usersRepository.save(new Users(2, "Arul", "Development", 3500L));

			}

		};
	}*/
}
