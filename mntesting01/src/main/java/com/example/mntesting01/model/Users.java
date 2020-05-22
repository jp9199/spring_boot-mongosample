package com.example.mntesting01.model;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class Users implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private UUID myId;
	private String name;
	private Integer testNumber;

	public UUID getMyId() {
		return myId;
	}

	public void setMyId(UUID myId) {
		this.myId = myId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getTestNumber() {
		return testNumber;
	}

	public void setTestNumber(Integer testNumber) {
		this.testNumber = testNumber;
	}

}
