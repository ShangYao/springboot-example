package com.example.es.rep;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.example.es.domain.User;

/**
 * 
 * @description
 * @author shangyao
 * @date 2018年3月23日
 */
public interface UserRep extends ElasticsearchRepository<User, Long> {

}
