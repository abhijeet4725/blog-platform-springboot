package com.abhijeet.blog.repositories;

import com.abhijeet.blog.domain.entities.Category;
import com.abhijeet.blog.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CategoryRepository extends JpaRepository<Category, UUID> {

}
