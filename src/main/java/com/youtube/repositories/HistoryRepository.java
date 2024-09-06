package com.youtube.repositories;

import com.youtube.model.History;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoryRepository extends JpaRepository<History, String> {
}
