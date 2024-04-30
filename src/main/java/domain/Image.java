package domain;

public class Image {
	
    private String name;
    private String data; // Representação Base64 da imagem
    
    
    
	public Image(String name, String data) {
		super();
		this.name = name;
		this.data = data;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}

    
}
