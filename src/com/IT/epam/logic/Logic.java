package com.IT.epam.logic;

import java.util.List;

import com.IT.epam.bean.*;

public class Logic {
	
	
	
	public double regionArea(List<District> list) {
		double sum=0;
		for (District dsr : list) {
			sum= sum+dsr.getDistrctArea();
		}
		return sum; 
	}
	

}
