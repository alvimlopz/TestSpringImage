package com.alvimcode.aplicacaoSpringTeste;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.alvim.adapador.imageLocal.ImagemLocalRepository;
import com.alvim.adapador.imagemdb.DBImagemRepository;

import domain.ImageRepository;

@Configuration
public class ApplicationConfiguration {
	
	 @Bean
	    @Profile("local")
	    public ImageRepository localImageRepository() {
	        return new ImagemLocalRepository();
	    }

	    @Bean
	    @Profile("!local")
	    public ImageRepository dbImageRepository(DBImagemRepository dbImageRepository) {
	        return (ImageRepository) dbImageRepository;
	    }
	}


