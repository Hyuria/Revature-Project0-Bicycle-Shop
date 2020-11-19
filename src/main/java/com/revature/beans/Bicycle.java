package com.revature.beans;

import java.util.HashSet;
import java.util.Set;

public class Bicycle {
	private Integer id;
	private String manufacturer;
	private String modelName;
	private Category category;
	private Boolean avaliable;
	private Long price;
	private Long financedAmount;
	private Integer financeDuration;
	private Set<Offer> offers;
	
	public Bicycle() {
		id = 0;
		manufacturer = "";
		modelName = "";
		category = new Category();
		avaliable = true;
		price = Long.valueOf(0);
		offers = new HashSet<Offer>();
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public String getModelName() {
		return modelName;
	}

	public void setModelNAme(String modelName) {
		this.modelName = modelName;
	}
	
	public Category getCategory() {
		return category;
	}
	
	public void setCategory(Category category) {
		this.category = category;
	}
	
	public Boolean getAvailability() {
		return avaliable;
	}
	
	public void setAvailability(Boolean avaliable) {
		this.avaliable = avaliable;
	}
	
	public long getPrice() {
		return price;
	}
	
	public void setPrice(long price) {
		this.price = price;
	}
	
	public long getFinancedAmount() {
		return financedAmount;
	}
	
	public void setFinancedAmount(Long financedAmount) {
		this.financedAmount = financedAmount;
	}
	
	public long getFinanceDuration() {
		return financeDuration;
	}
	
	public void setFinanceDuration(Integer financeDuration) {
		this.financeDuration = financeDuration;
	} 
	
	public Set<Offer> getOffers() {
		return offers;
	}

	public void setOffers(Set<Offer> offers) {
		this.offers = offers;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((manufacturer == null) ? 0 : manufacturer.hashCode());
		result = prime * result + ((modelName == null) ? 0 : modelName.hashCode());
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bicycle other = (Bicycle) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (manufacturer == null) {
			if (other.manufacturer != null)
				return false;
		} else if (!manufacturer.equals(other.manufacturer))
			return false;
		if (modelName == null) {
			if (other.modelName != null)
				return false;
		} else if (!modelName.equals(other.modelName))
			return false;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (financedAmount == null) {
			if (other.financedAmount != null)
				return false;
		} else if (!financedAmount.equals(other.financedAmount))
			return false;
		if (financeDuration == null) {
			if (other.financeDuration != null)
				return false;
		} else if (!financeDuration.equals(other.financeDuration))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bicycle [id=" + id + ", manufacturer=" + manufacturer + ": modelName=" + modelName + ", category=" + category 
				+ ", Price (in cent) = " + price + "]";
	}
	
}
