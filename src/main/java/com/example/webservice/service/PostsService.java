package com.example.webservice.service;

import com.example.webservice.domain.posts.PostsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

//    @Transactional
//    public Long save(PostsSaveRequestDto requestDto){
//        return postsRepository.save().getId();
//    }

}
