package com.example.demo.models;


public class FruitDTO {
	private String name;
	private int id;
	private String family;
	private String order;
	private String genus;
	
	NutritionDTO nutritions;

	public NutritionDTO getNutritions() {
		return nutritions;
	}

	public void setNutritions(NutritionDTO nutritions) {
		this.nutritions = nutritions;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getGenus() {
		return genus;
	}

	public void setGenus(String genus) {
		this.genus = genus;
	}
}

