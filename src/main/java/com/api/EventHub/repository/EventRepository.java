package com.api.EventHub.repository;

import com.api.EventHub.model.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EventRepository extends JpaRepository<Event, Long> {
}
