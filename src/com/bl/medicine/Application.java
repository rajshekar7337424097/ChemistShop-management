//controllLayer
package com.bl.medicine;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Application {


	UserInterface userinterface = new UserInterface();
	MedicineStore medicineStore = new MedicineStore();

	public static void main(String[] args) {

		Application application = new Application();

		//		userinterface.showMainMemu();
		int choose = 0;
		while(choose != 8) {
			choose = application.userinterface.showMainMenu();
			application.handleUserSelection(choose);

		}



		//		Coldact coldact = new Coldact();
		//		coldact.mfgDate = new Date("2019/09/10");
		//		coldact.ExpiryDate = new Date("2022/09/10");
		//		
		//		Advil advil = new Advil();
		//		advil.mfgDate = new Date("2017/09/10");
		//		advil.ExpiryDate = new Date("2019/09/10");
		//		
		//		Frozen frozen = new Frozen();
		//		frozen.mfgDate = new Date("2018/09/10");
		//		frozen.ExpiryDate = new Date("2021/09/10");
		//		
		//		MotrinIB motrinIB = new MotrinIB();
		//		motrinIB.mfgDate = new Date("2015/09/10");
		//		motrinIB.ExpiryDate = new Date("2018/09/10");
		//		
		//		Aleve aleve = new Aleve();
		//		aleve.mfgDate = new Date("2019/10/09");
		//		aleve.ExpiryDate = new Date("2018/09/10");
		//
		//		MedicineStore medicineStore = new MedicineStore();
		//
		//		medicineStore.add(coldact);
		//		medicineStore.add(advil);
		//		medicineStore.add(frozen);
		//		medicineStore.add(motrinIB);
		//		medicineStore.add(aleve);
		//
		//		UserInterface userInterface = new UserInterface();
		//		List medicineList = medicineStore.getmedicineList();
		////		userInterface.print(medicineList);
		//		userInterface.forAllAlllopathy(medicineList);
		//		userInterface.forAllAyurvedic(medicineList);
		//		userInterface.forAllHomeopathy(medicineList);
		//		
		//
		//		medicineStore.remove(coldact);
		//		medicineStore.remove(advil);
		//
		//		System.out.println("Printing after removal");
		////		userInterface.print(medicineList);
		//		System.out.println("allopothay");
		//		userInterface.forAllAlllopathy(medicineList);
		//		System.out.println("Ayurvedic");
		//		userInterface.forAllAyurvedic(medicineList);
		//		System.out.println("Homeopathy");
		//		userInterface.forAllHomeopathy(medicineList);
		//		
	}

	void addMedicine() {
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

//		MedicineStore medicineStore = new MedicineStore();

		medicineStore.add(coldact);
		medicineStore.add(advil);
		medicineStore.add(frozen);
		medicineStore.add(motrinIB);
		medicineStore.add(aleve);
	}

	public void removeMedicine() {
		System.out.println("enter medicine what you want to remove");
		Scanner sc = new Scanner(System.in);
		String medicineName = sc.nextLine();
		Medicine medicine = medicineStore.getMedicine(medicineName);
		medicineStore.remove(medicine);
	}

	private void handleUserSelection(int choose) {

		switch(choose) {
		case 1:
			addMedicine();
			break;
		case 2:
			removeMedicine();
			break;
		case 3:
			System.out.println("enter medicine what you want to remove");
			Scanner sc = new Scanner(System.in);
			String medicineName = sc.nextLine();
			Medicine medicine = medicineStore.getMedicine(medicineName);
			userinterface.update(medicine);
			break;
		case 4:
			List medicineList = medicineStore.getmedicineList();
			userinterface.print(medicineStore.getmedicineList());
			break;
		case 5:
			List forAllAlllopathiList = medicineStore.getmedicineList();
			userinterface.forAllAlllopathy(forAllAlllopathiList);
			break;
		case 6:
			List forAllAyurvedicList = medicineStore.getmedicineList();
			userinterface.forAllAyurvedic(forAllAyurvedicList);
			
			break;
		case 7:
			List forAllHomeopathyList = medicineStore.getmedicineList();
			userinterface.forAllHomeopathy(forAllHomeopathyList);
			break;
		case 8:

		default:
			break;
		}
	}
}
