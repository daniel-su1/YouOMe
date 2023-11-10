package com.daniel.springboot.YouOMe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daniel.springboot.YouOMe.dao.FriendRepository;
import com.daniel.springboot.YouOMe.entity.Friend;

import java.util.List;
import java.util.Optional;

@Service
public class FriendServiceImpl implements FriendService {

    private FriendRepository friendRepository;

    @Autowired
    public FriendServiceImpl(FriendRepository theFriendRepository) {
        friendRepository = theFriendRepository;
    }

    @Override
    public List<Friend> findAll() {
        return friendRepository.findAllByOrderByLastNameAsc();
    }

    @Override
    public Friend findById(int theId) {
        Optional<Friend> result = friendRepository.findById(theId);

        Friend theFriend = null;

        if (result.isPresent()) {
            theFriend = result.get();
        }
        else {
            // we didn't find the friend
            throw new RuntimeException("Did not find friend id - " + theId);
        }

        return theFriend;
    }

    @Override
    public Friend save(Friend theFriend) {
        return friendRepository.save(theFriend);
    }

    @Override
    public void deleteById(int theId) {
        friendRepository.deleteById(theId);
    }
}






