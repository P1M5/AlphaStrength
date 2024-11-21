package com.p1m5.alphastrength.repository;

import com.p1m5.alphastrength.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<User, Long> {
}
