package com.quiz.database.repositories;

import com.quiz.database.entities.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PlayerRepository extends JpaRepository<PlayerEntity, Long> {
}