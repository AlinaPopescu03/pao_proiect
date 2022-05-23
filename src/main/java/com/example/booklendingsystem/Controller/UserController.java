package com.example.booklendingsystem.Controller;

import com.example.booklendingsystem.Model.Users;
import com.example.booklendingsystem.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
public class UserController {


    public final UserService userService;

    @PostMapping("/addUser")
    public void addUser(@RequestBody Users user){
        userService.saveUser(user);

    }

    @PostMapping("/addUsers")
    public List<Users> addUsers(@RequestBody List<Users> users){
        return userService.saveUsers(users);

    }

    @GetMapping("/listUsers")
    public List<Users> findAllUsers(){
        return userService.getUsers();
    }


    @GetMapping("/UserById/{id}")
    public Users findUsersById(@PathVariable int id){
        return userService.getUserById(id);
    }


    @GetMapping("/UserbyName/{fname}/{lname}")
    public ResponseEntity<Users> findUserByName(@PathVariable String fname, @PathVariable String lname){
        var user = userService.getUserbyName(lname, fname);
        if ( user.isPresent()){
            return ResponseEntity.of(user);
        }
        return ResponseEntity.noContent().build();
    }


//    @PutMapping("/updateUser")
//    public Users updateUsers(@RequestBody Users user){
//        return userService.updateUser(user);
//
//    }

    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable int id){
        return userService.deleteUser(id);
    }
}
