package com.p1m5.alphastrength.repository;

import com.p1m5.alphastrength.model.Workout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface workoutRepository extends JpaRepository<Workout,Long> {
}
