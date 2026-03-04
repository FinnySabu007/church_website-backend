package com.cog.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cog.backend.model.Events;


//How to use JpaRepo :- JpaRepository<EntityClass, PrimaryKeyType>
@Repository
public interface EventsRepository extends JpaRepository<Events,Long> {

}
