package com.bl.medicine;

import java.util.List;

public class Application {

	public static void main(String[] args) {

		Coldact coldact = new Coldact();
		Advil advil = new Advil();
		Frozen frozen = new Frozen();
		MotrinIB motrinIB = new MotrinIB();

		MedicineStore medicineStore = new MedicineStore();

		medicineStore.add(coldact);
		medicineStore.add(advil);
		medicineStore.add(frozen);
		medicineStore.add(motrinIB);

		UserInterface userInterface = new UserInterface();
		List medicineList = medicineStore.getmedicineList();
		userInterface.print(medicineList);

		medicineStore.remove(coldact);
		medicineStore.remove(advil);
		
		System.out.println("Printing after removal");
		userInterface.print(medicineList);
		
		
		
	}

}
