package com.daniel.springboot.YouOMe.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.daniel.springboot.YouOMe.entity.Friend;
import com.daniel.springboot.YouOMe.service.FriendService;

@Controller
@RequestMapping("/friends")
public class FriendController {
    private FriendService friendService;
    public FriendController(FriendService theFriendService) {
        friendService = theFriendService;
    }

    //add mapping for "/list"
    @GetMapping("/list")
    public String listFriends(Model theModel){
        //get friends from db
        List<Friend> theFriends = friendService.findAll();

        //add to the spring model
        theModel.addAttribute("friends", theFriends);

        return "/friends/list-friends";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel){
        //create model attribute to bind form data
        Friend theFriend = new Friend();

        theModel.addAttribute("friend", theFriend);

        return "friends/friend-form";
    }

    @PostMapping("/save")
    public String saveFriend(Friend theFriend){
        //save the friend
        friendService.save(theFriend);

        //use a redirect to prevent duplicate submissions
        return "redirect:/friends/list";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("friendId") int theId, Model theModel){
        //get the friend from the service
        Friend theFriend = friendService.findById(theId);

        //set friend as a model attribute to pre-populate the form
        theModel.addAttribute("friend", theFriend);

        //send over to our form
        return "friends/friend-form";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("friendId")int theId){
        //delete the friend
        friendService.deleteById(theId);

        //redirect to /friends/list
        return "redirect:/friends/list";
    }

}
