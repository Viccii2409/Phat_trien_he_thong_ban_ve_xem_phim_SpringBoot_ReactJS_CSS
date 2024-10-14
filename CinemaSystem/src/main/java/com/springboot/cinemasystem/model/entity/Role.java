package com.springboot.cinemasystem.model.entity;

import java.util.*;

public class Role {

	List<User> user;
	private int roleID;
	private String name;
	private boolean status;

	public int getRoleID() {
		return this.roleID;
	}

	/**
	 * 
	 * @param roleID
	 */
	public void setRoleID(int roleID) {
		this.roleID = roleID;
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public boolean getStatus() {
		return this.status;
	}

	/**
	 * 
	 * @param status
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}

}