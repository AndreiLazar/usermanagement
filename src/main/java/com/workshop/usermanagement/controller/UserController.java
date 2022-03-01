package com.workshop.usermanagement.controller;

import com.workshop.usermanagement.dto.UserDto;
import com.workshop.usermanagement.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public UserDto saveUser(@RequestBody UserDto userDto) {
        return userService.saveUser(userDto);
    }

    @GetMapping("/{id}")
    public UserDto getUser(@PathVariable("id") Integer id) {
        return userService.getUser(id);
    }

    @GetMapping("/all")
    public List<UserDto> getAllUser() {
        return userService.getAllUsers();
    }


    @PutMapping("/{id}")
    public UserDto editUser(@PathVariable("id") Integer id) {
        return userService.editUser(id);
    }

    @DeleteMapping("delete/{id}")
    public boolean deleteUser(@PathVariable("id") Integer id) {
        return userService.deleteUser(id);
    }

    @GetMapping("/all/{ids}")
    public List<UserDto> getUsersByIds(@PathVariable List<Integer> ids){
       return userService.getUsersByIds(ids);
    }
}
