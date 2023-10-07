package com.example.demospringweek7edo.repository;

import com.example.demospringweek7edo.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Integer> {
}
