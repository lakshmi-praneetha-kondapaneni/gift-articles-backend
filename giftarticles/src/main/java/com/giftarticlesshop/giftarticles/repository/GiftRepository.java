package com.giftarticlesshop.giftarticles.repository;

import com.giftarticlesshop.giftarticles.entity.Gift;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GiftRepository extends JpaRepository<Gift,String> {
}
