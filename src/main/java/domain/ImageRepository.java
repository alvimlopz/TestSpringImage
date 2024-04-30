package domain;

public interface ImageRepository {
	
	   void save(Image image);
	   Image findByName(String name);

}
