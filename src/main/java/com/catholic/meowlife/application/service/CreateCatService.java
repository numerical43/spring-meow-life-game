package com.catholic.meowlife.application.service;

import com.catholic.meowlife.domain.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateCatService {
    @Autowired
    CatRepository catRepository;

    public void createCat(String catName, String catBreeds) {
        catRepository.createCatInDB(catName,catBreeds);

        // 머지 이후 게임 컨트롤러(게임 컨트롤러? 게임 화면 뷰?)로 이동 추가

    }
}
