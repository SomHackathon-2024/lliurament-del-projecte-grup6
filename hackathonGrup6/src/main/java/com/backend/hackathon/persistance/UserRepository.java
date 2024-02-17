package com.backend.hackathon.persistance;

import com.backend.hackathon.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<Users, String> {
}
