package com.daniel.springboot.YouOMe.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.daniel.springboot.YouOMe.entity.Friend;

public interface FriendRepository extends JpaRepository<Friend, Integer> {

    //add a method to sort by last name
    public List<Friend> findAllByOrderByLastNameAsc();
}
