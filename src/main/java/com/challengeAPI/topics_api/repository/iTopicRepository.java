package com.challengeAPI.topics_api.repository;

import com.challengeAPI.topics_api.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iTopicRepository extends JpaRepository<Topic, Long> {
}
