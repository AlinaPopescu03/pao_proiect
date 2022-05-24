package com.example.booklendingsystem.Repository;


import com.example.booklendingsystem.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {

    @Query("select user from Users user where user.firstName=:fname and user.lastName=:lname")
    Optional<Users> findUserBy(String fname,String  lname);

    @Query("select user from Users user where user.username=:username")
    Optional<Users> findUserByUsername(String username);
}
