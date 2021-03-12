package test;

import javax.xml.bind.annotation.*;

@XmlRootElement
public class Product {
	public Product() {
		super();
	}
public Double getFarheniet() {
		return farheniet;
	}

	public void setFarheniet(Double farheniet) {
		this.farheniet = farheniet;
	}

public Double farheniet;
}
