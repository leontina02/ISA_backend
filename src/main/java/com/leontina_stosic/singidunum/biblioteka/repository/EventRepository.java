package com.leontina_stosic.singidunum.biblioteka.repository;

import com.leontina_stosic.singidunum.biblioteka.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}
