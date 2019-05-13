package com.bridgelabz.fundonoteapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.fundonoteapp.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    public User save(User user);

    // List<User> findByEmail(String s);

    List<User> findByEmailAndPassword(String email, String password);

}