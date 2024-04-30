package com.alvim.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domain.Image;
import domain.ImageRepository;

@Service
public class ImageService {
	
	 private final ImageRepository imageRepository;

	 @Autowired
	    public ImageService(ImageRepository imageRepository) {
	        this.imageRepository = imageRepository;
	    }

	    public void uploadImage(Image image) {
	        imageRepository.save(image);
	    }

	    public Image downloadImage(String name) {
	        return imageRepository.findByName(name);
	    }
	}