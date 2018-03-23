package com.example.es.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * 
 * @description
 * @author shangyao
 * @date 2018年3月23日
 */
@Document(indexName = "es_test", type = "user", shards = 2, replicas = 1, refreshInterval = "-1")
public class User {
	@Id
	private long id;
	private String name;

	public User(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public User() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
