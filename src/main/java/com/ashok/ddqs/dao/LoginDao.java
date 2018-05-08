package com.ashok.ddqs.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ashok.ddqs.model.User;

@Repository
public interface LoginDao extends CrudRepository<User, Long>{

}
