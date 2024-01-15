package com.giftarticlesshop.giftarticles.service;

import com.giftarticlesshop.giftarticles.entity.Gift;
import com.giftarticlesshop.giftarticles.repository.GiftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GiftService {

    @Autowired
    GiftRepository giftRepository;

    public Gift createGift(Gift gift){
        return giftRepository.save(gift);
    }
}
