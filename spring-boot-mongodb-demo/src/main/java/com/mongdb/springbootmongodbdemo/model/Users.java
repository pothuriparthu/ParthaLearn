/**
 * 
 */
package com.mongdb.springbootmongodbdemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author papothur
 *
 */

@Document
public class Users {
	
	@Id
	private Integer id;
	private String name;
	private String teamName;
	private Long salary;
	
	
	/**
	 * @param id
	 * @param name
	 * @param teamName
	 * @param salary
	 */
	public Users(Integer id, String name, String teamName, Long salary) {
		this.id = id;
		this.name = name;
		this.teamName = teamName;
		this.salary = salary;
	}


	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the teamName
	 */
	public String getTeamName() {
		return teamName;
	}


	/**
	 * @param teamName the teamName to set
	 */
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	/**
	 * @return the salary
	 */
	public Long getSalary() {
		return salary;
	}


	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	
	
	
		
	
	

}
