package com.alvim.adapador.imageLocal;

import java.util.HashMap;
import java.util.Map;

import domain.Image;
import domain.ImageRepository;

public class ImagemLocalRepository implements ImageRepository{
	
	private final Map<String, Image> imageMap = new HashMap<>();


	@Override
    public void save(Image image) {
        imageMap.put(image.getName(), image);
    }

    @Override
    public Image findByName(String name) {
        return imageMap.get(name);
    }

}
