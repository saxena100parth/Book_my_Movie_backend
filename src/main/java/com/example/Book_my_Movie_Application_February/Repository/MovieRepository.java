package com.example.Book_my_Movie_Application_February.Repository;

import com.example.Book_my_Movie_Application_February.Entities.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<MovieEntity,Integer> {
}
