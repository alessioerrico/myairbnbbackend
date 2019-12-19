package it.unisalento.myairbnb.dto;

import javax.validation.constraints.NotEmpty;

public class ProductDTO {
	
	@NotEmpty
	int idproduct;
	@NotEmpty
	int quantity;	
	String description;
	
	
	
	
	
	
	
	
	public int getIdproduct() {
		return idproduct;
	}
	public void setIdproduct(int idproduct) {
		this.idproduct = idproduct;
	}
	
	
	public int getQuantity()
	{
		return quantity;
	}
	public void setQuantity(int quantity)
	{
		this.quantity=quantity;
	}
	
	public String getDescription()
	{
		return description;
	}
	public void setDescription(String description)
	{
		this.description=description;
	}


}
