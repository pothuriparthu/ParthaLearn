/**
 * 
 */
package com.mongdb.springbootmongodbdemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongdb.springbootmongodbdemo.model.Users;

/**
 * @author papothur
 *
 */
public interface UsersRepository extends MongoRepository<Users, Integer> {

}
