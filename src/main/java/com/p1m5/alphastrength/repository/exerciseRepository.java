package com.p1m5.alphastrength.repository;

import com.p1m5.alphastrength.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface exerciseRepository extends JpaRepository<Exercise,Long> {
}
