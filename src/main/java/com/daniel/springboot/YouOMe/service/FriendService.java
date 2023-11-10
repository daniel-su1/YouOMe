package com.daniel.springboot.YouOMe.service;

import java.util.List;

import com.daniel.springboot.YouOMe.entity.Friend;

public interface FriendService {

    List<Friend> findAll();

    Friend findById(int theId);

    Friend save(Friend theFriend);

    void deleteById(int theId);

}
