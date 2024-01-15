package com.giftarticlesshop.giftarticles.controller;

import com.giftarticlesshop.giftarticles.entity.Gift;
import com.giftarticlesshop.giftarticles.service.GiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gift-articles")
public class GiftController {

    @Autowired
    GiftService giftService;

    @GetMapping("/hello")
    ResponseEntity<String> hello()
    {
        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }

    @PostMapping("/create-gift")
    ResponseEntity<Gift> createGift(@RequestBody Gift gift){
        return new ResponseEntity<>(giftService.createGift(gift),HttpStatus.CREATED);
    }
}
