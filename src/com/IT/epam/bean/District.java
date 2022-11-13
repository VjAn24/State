package com.IT.epam.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class District {
	private double distrctArea;
	private List<City> citysList = new ArrayList<>();
	
	public District() {
		super();
	}

	public District(double distrctArea, List<City> citysList) {
		super();
		this.distrctArea = distrctArea;
		this.citysList = citysList;
	}

	public double getDistrctArea() {
		return distrctArea;
	}

	public void setDistrctArea(double distrctArea) {
		this.distrctArea = distrctArea;
	}

	public List<City> getCitysList() {
		return citysList;
	}

	public void setCitysList(List<City> citysList) {
		this.citysList = citysList;
	}
	
	public void addDsr(City ct) {
		citysList.add(ct);
	}

	@Override
	public int hashCode() {
		return Objects.hash(citysList, distrctArea);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		District other = (District) obj;
		return Objects.equals(citysList, other.citysList)
				&& Double.doubleToLongBits(distrctArea) == Double.doubleToLongBits(other.distrctArea);
	}

	@Override
	public String toString() {
		return "District [distrctArea=" + distrctArea + ", citysList=" + citysList + "]";
	}
	
}
