package com.website.e_commerce.repository;

import com.website.e_commerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    public static User findByEmail(String email) {
        return null;
    }
}
