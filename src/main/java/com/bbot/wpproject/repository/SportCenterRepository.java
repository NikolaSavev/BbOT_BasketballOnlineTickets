package com.bbot.wpproject.repository;

import com.bbot.wpproject.model.SportCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SportCenterRepository extends JpaRepository<SportCenter, Long> {
}
