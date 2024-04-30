package com.alvim.adapador.imagemdb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import domain.Image;
import domain.ImageRepository;

@Repository
public interface DBImagemRepository extends JpaRepository<Image, Long> {
	
	 Image findByName(String name);
}
