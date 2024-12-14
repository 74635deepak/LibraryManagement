package com.example.LibraryManagement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibRepository extends JpaRepository<Book, Integer>{

}
