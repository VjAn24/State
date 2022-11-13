package com.IT.epam.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Country {
	private List<Region> regionsList = new ArrayList<>();
	private String country;
	private String capital;
	
	public Country() {
		super();
	}
	
	public Country(List<Region> regionsList, String country, String capital) {
		super();
		this.regionsList = regionsList;
		this.country = country;
		this.capital = capital;
	}

	public List<Region> getRegionsList() {
		return regionsList;
	}

	public void setRegionsList(List<Region> regionsList) {
		this.regionsList = regionsList;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCapital() {
		return capital;
	}
	
	public void addCou(Region reg) {
		regionsList.add(reg);
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	@Override
	public int hashCode() {
		return Objects.hash(capital, country, regionsList);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		return Objects.equals(capital, other.capital) && Objects.equals(country, other.country)
				&& Objects.equals(regionsList, other.regionsList);
	}

	@Override
	public String toString() {
		return "Country [regionsList=" + regionsList + ", country=" + country + ", capital=" + capital + "]";
	}
	
	
	
	
	

}
