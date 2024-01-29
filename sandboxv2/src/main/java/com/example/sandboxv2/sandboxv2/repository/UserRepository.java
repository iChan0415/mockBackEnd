package com.example.sandboxv2.sandboxv2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.sandboxv2.sandboxv2.entity.Users;

public interface UserRepository extends JpaRepository<Users, Long>{

}
