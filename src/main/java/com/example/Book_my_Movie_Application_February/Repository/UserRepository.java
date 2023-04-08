package com.example.Book_my_Movie_Application_February.Repository;

import com.example.Book_my_Movie_Application_February.Entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {
}
