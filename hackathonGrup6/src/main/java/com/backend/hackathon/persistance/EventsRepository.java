package com.backend.hackathon.persistance;

import com.backend.hackathon.application.dto.EventsDTO;
import com.backend.hackathon.domain.Events;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventsRepository extends JpaRepository<Events, String> {

    @Query("select c from events c where c.available = true order by c.title")
    List<EventsDTO> findEventsByTitle();

    @Query("select c from events c order by c.lastUpdateDate")
    List<EventsDTO> findRecentEvents();

    boolean existsByTitle(String title);
}
