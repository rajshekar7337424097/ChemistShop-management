package com.bl.medicine;

import java.util.Date;
import java.util.List;

public class Application {

	public static void main(String[] args) {

		Coldact coldact = new Coldact();
		coldact.mfgDate = new Date("2019/09/10");
		coldact.ExpiryDate = new Date("2022/09/10");
		
		Advil advil = new Advil();
		advil.mfgDate = new Date("2017/09/10");
		advil.ExpiryDate = new Date("2019/09/10");
		
		Frozen frozen = new Frozen();
		frozen.mfgDate = new Date("2018/09/10");
		frozen.ExpiryDate = new Date("2021/09/10");
		
		MotrinIB motrinIB = new MotrinIB();
		motrinIB.mfgDate = new Date("2015/09/10");
		motrinIB.ExpiryDate = new Date("2018/09/10");
		
		Aleve aleve = new Aleve();
		aleve.mfgDate = new Date("2019/10/09");
		aleve.ExpiryDate = new Date("2018/09/10");

		MedicineStore medicineStore = new MedicineStore();

		medicineStore.add(coldact);
		medicineStore.add(advil);
		medicineStore.add(frozen);
		medicineStore.add(motrinIB);
		medicineStore.add(aleve);

		UserInterface userInterface = new UserInterface();
		List medicineList = medicineStore.getmedicineList();
//		userInterface.print(medicineList);
		userInterface.forAllAlllopathy(medicineList);
		userInterface.forAllAyurvedic(medicineList);
		userInterface.forAllHomeopathy(medicineList);
		

		medicineStore.remove(coldact);
		medicineStore.remove(advil);

		System.out.println("Printing after removal");
//		userInterface.print(medicineList);
		System.out.println("allopothay");
		userInterface.forAllAlllopathy(medicineList);
		System.out.println("Ayurvedic");
		userInterface.forAllAyurvedic(medicineList);
		System.out.println("Homeopathy");
		userInterface.forAllHomeopathy(medicineList);
		
	}
}
