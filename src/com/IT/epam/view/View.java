package com.IT.epam.view;

import java.util.List;

import com.IT.epam.bean.*;

public class View {
	
	public void print() {
		System.out.print(false);
	}
	
	public void print(List<Region> regions) {
		for (Region reg : regions) {
			System.out.println("Regional center - "+ reg.getRegionalCenter());
		}
	}
	
	public void print(String message, double nummer) {
		System.out.print(message+nummer);
	}

}
