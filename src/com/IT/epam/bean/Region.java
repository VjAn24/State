package com.IT.epam.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Region {
	private double regionArea;
	private List<District> districtsList = new ArrayList<>();
	private String regionalCenter;
	
	public Region(double regionArea, List<District> districtsList, String regionalCenter) {
		super();
		this.regionArea = regionArea;
		this.districtsList = districtsList;
		this.regionalCenter = regionalCenter;
	}

	public Region() {
		super();
	}

	public double getRegionArea() {
		return regionArea;
	}

	public void setRegionArea(double regionArea) {
		this.regionArea = regionArea;
	}

	public List<District> getDistrictsList() {
		return districtsList;
	}

	public void setDistrictsList(List<District> districtsList) {
		this.districtsList = districtsList;
	}

	public String getRegionalCenter() {
		return regionalCenter;
	}

	public void setRegionalCenter(String regionalCenter) {
		this.regionalCenter = regionalCenter;
	}
	
	public void addReg(District dsr) {
		districtsList.add(dsr);
	}

	@Override
	public int hashCode() {
		return Objects.hash(districtsList, regionArea, regionalCenter);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Region other = (Region) obj;
		return Objects.equals(districtsList, other.districtsList)
				&& Double.doubleToLongBits(regionArea) == Double.doubleToLongBits(other.regionArea)
				&& Objects.equals(regionalCenter, other.regionalCenter);
	}

	@Override
	public String toString() {
		return "Region [regionArea=" + regionArea + ", districtsList=" + districtsList + ", regionalCenter="
				+ regionalCenter + "]";
	}
	
	
	
	
}
