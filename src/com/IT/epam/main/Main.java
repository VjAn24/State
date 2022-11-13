package com.IT.epam.main;

import com.IT.epam.bean.*;
import com.IT.epam.logic.Logic;
import com.IT.epam.view.View;

public class Main {

	public static void main(String[] args) {
		City city1 = new City("Pinsk");
		City city2 = new City("Stolin");
		City city3 = new City("Ivanovo");
		City city4 = new City("Lida");
		City city5 = new City("Bobruisk");
		City city6 = new City("Polotsk");
		City city7 = new City("Bereza");
		City city8 = new City("Orsha");
		City city9 = new City("Braslav");
		City city10 = new City("Stolbcy");
		City city11 = new City("Kobrin");
		City city12 = new City("Slonim");
		City city13 = new City("Byhov");
		City city14 = new City("Mozyr");
		City city15 = new City("Ghlobin");
		
		District pinskDistrict=  new District();
		District stolinDistrict=  new District();
		District ivanovoDistrict=  new District();
		District lidaDistrict=  new District();
		District bobruiskDistrict=  new District();
		District polotskDistrict=  new District();
		District berezaDistrict=  new District();
		District orshaDistrict=  new District();
		District braslavDistrict=  new District();
		District stolbcyDistrict=  new District();
		District kobrinDistrict=  new District();
		District slonimDistrict=  new District();
		District byhovDistrict=  new District();
		District mozyrDistrict=  new District();
		District ghlobinDistrict=  new District();
		
		pinskDistrict.addDsr(city1);
		pinskDistrict.setDistrctArea(4562);
		stolinDistrict.addDsr(city2);
		stolinDistrict.setDistrctArea(2653);;
		ivanovoDistrict.addDsr(city3);
		ivanovoDistrict.setDistrctArea(1536);
		lidaDistrict.addDsr(city4);
		lidaDistrict.setDistrctArea(2635);
		bobruiskDistrict.addDsr(city5);
		bobruiskDistrict.setDistrctArea(3541);
		polotskDistrict.addDsr(city6);
		polotskDistrict.setDistrctArea(1452);
		berezaDistrict.addDsr(city7);
		berezaDistrict.setDistrctArea(1264);
		orshaDistrict.addDsr(city8);
		orshaDistrict.setDistrctArea(4562);
		braslavDistrict.addDsr(city9);
		braslavDistrict.setDistrctArea(1532);
		stolbcyDistrict.addDsr(city10);
		stolbcyDistrict.setDistrctArea(2635);
		kobrinDistrict.addDsr(city11);
		kobrinDistrict.setDistrctArea(2365);
		slonimDistrict.addDsr(city12);
		slonimDistrict.setDistrctArea(1542);
		byhovDistrict.addDsr(city13);
		byhovDistrict.setDistrctArea(2145);
		mozyrDistrict.addDsr(city14);
		mozyrDistrict.setDistrctArea(2635);
		ghlobinDistrict.addDsr(city15);
		ghlobinDistrict.setDistrctArea(4256);
		
		Region brestRegion = new Region();
		brestRegion.setRegionalCenter("Brest");
		brestRegion.addReg(pinskDistrict);
		brestRegion.addReg(kobrinDistrict);
		brestRegion.addReg(ivanovoDistrict);
		brestRegion.addReg(stolinDistrict);
		
		Region gomelRegion = new Region();
		gomelRegion.setRegionalCenter("Gomel");
		gomelRegion.addReg(mozyrDistrict);
		gomelRegion.addReg(ghlobinDistrict);
		
		Region vitsebskRegion = new Region();
		vitsebskRegion.setRegionalCenter("Vitsebsk");
		vitsebskRegion.addReg(braslavDistrict);
		vitsebskRegion.addReg(polotskDistrict);
		vitsebskRegion.addReg(orshaDistrict);
		
		Region grodnoRegion = new Region();
		grodnoRegion.setRegionalCenter("Grodno");
		grodnoRegion.addReg(slonimDistrict);
		grodnoRegion.addReg(lidaDistrict);
		
		Region mogilevRegion = new Region();
		mogilevRegion.setRegionalCenter("Mogilev");
		mogilevRegion.addReg(byhovDistrict);
		mogilevRegion.addReg(bobruiskDistrict);
		
		Region minskRegion = new Region();
		minskRegion.setRegionalCenter("Minsk");
		minskRegion.addReg(stolbcyDistrict);
		minskRegion.addReg(berezaDistrict);
		
		Country belarus=new Country();
		belarus.setCapital("Minsk");
		belarus.addCou(minskRegion);
		belarus.addCou(mogilevRegion);
		belarus.addCou(grodnoRegion);
		belarus.addCou(vitsebskRegion);
		belarus.addCou(gomelRegion);
		belarus.addCou(brestRegion);
		
		View out = new View();
		Logic logic = new Logic();
		
		System.out.println("Capital" + belarus.getCapital());
		
		System.out.println("Regional centers");
		out.print(belarus.getRegionsList());
		
		System.out.println("Zahl Region = "+ belarus.getRegionsList().size());
		
		out.print("Brest Region Area = ", logic.regionArea(brestRegion.getDistrictsList()));
		
		
		
	}

}
