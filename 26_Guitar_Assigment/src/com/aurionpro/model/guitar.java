package com.aurionpro.model;

public class guitar {
	private String SerialNumber ;
	private Double Price ;
	private builder Builder ;
	private String model ;
	private type type ;
	private WOOD blackWood ;
	private WOOD topWood ;
	public String getSerialNumber() {
		return SerialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		SerialNumber = serialNumber;
	}
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}
	public builder getBuilder() {
		return Builder;
	}
	public void setBuilder(builder builder) {
		Builder = builder;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public type getType() {
		return type;
	}
	public void setType(type type) {
		this.type = type;
	}
	public WOOD getBlackWood() {
		return blackWood;
	}
	public void setBlackWood(WOOD blackWood) {
		this.blackWood = blackWood;
	}
	public WOOD getTopWood() {
		return topWood;
	}
	public void setTopWood(WOOD topWood) {
		this.topWood = topWood;
	}
	public guitar(String serialNumber, Double price, builder builder, String model, type type, WOOD blackWood,
			WOOD topWood) {
		super();
		SerialNumber = serialNumber;
		Price = price;
		Builder = builder;
		this.model = model;
		this.type = type;
		this.blackWood = blackWood;
		this.topWood = topWood;
	}
	@Override
	public String toString() {
		return "guiter [SerialNumber=" + SerialNumber + ", Price=" + Price + ", Builder=" + Builder + ", model=" + model
				+ ", type=" + type + ", blackWood=" + blackWood + ", topWood=" + topWood + "]";
	}
	
	
	

}
