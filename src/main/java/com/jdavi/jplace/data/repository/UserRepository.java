package com.jdavi.jplace.data.repository;

import com.jdavi.jplace.data.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
