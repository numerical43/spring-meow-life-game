package com.catholic.meowlife.application.service;

import com.catholic.meowlife.domain.repository.CatRepository;
import com.catholic.meowlife.dto.CatDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EndingService {

    @Autowired
    CatRepository catRepository;

    public void deleteCatDTO(){
        catRepository.deleteCatDB();
    }

}
