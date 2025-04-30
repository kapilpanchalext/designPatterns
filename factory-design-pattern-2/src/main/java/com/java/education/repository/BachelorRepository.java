package com.java.education.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.java.education.entity.Bachelor;

public interface BachelorRepository extends JpaRepository<Bachelor, Long> {

}
