package com.challengeAPI.topics_api.service;

import com.challengeAPI.topics_api.dto.TopicDTO;
import com.challengeAPI.topics_api.entity.Topic;
import com.challengeAPI.topics_api.repository.iTopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TopicService {
    @Autowired
    private iTopicRepository topicRepository;

    public Topic createTopic(TopicDTO topicDTO){
        Topic topic = new Topic();
        topic.setTitle(topicDTO.getTitle());
        topic.setDescription(topicDTO.getDescription());
        return topicRepository.save(topic);
    }

    public List<Topic> getAllTopics(){
        return topicRepository.findAll();
    }

    public Topic getTopicById(Long id){
        return topicRepository.findById(id).orElseThrow(()-> new RuntimeException("Tópico não encontrado"));
    }

    public Topic updateTopic(Long id, TopicDTO topicDTO){
        Topic topic = getTopicById(id);
        topic.setTitle(topicDTO.getTitle());
        topic.setDescription(topicDTO.getDescription());
        return topicRepository.save(topic);
    }

    public void deleteTopic(Long id){
        Topic topic = getTopicById(id);
        topicRepository.deleteById(id);
    }
}
