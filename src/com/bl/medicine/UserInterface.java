//UiLayer
package com.bl.medicine;


import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.bl.medicine.Medicine.Type;

public class UserInterface {

	public void forAllHomeopathy(List<Medicine> list) {
		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).medicineType == Medicine.Type.HOMEIOPATHY) {
				System.out.println(list.get(i));
			}
		}
	}

	public void forAllAlllopathy(List<Medicine> list) {
		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).medicineType == Medicine.Type.ALLOPATHY) {
				System.out.println(list.get(i));
			}
		}
	}

	public void forAllAyurvedic(List<Medicine> list) {
		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).medicineType == Medicine.Type.AYURVEDIC) {
				System.out.println(list.get(i));
			}
		}
	}
	public  void print(List list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	int showMainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("select option from below");
		System.out.println("\n1.add, \n2.remove, \n3.update, \n4.PrintAllMedicine, \n5.Print all Allopathi, \n6.PrintAllayurvedic, \n7.PrintallHomeopathi, \n8.Exit");
		int choose = sc.nextInt();
		return choose;

	}

	public void update(Medicine medicine) {

		MedicineStore medicineStore = new MedicineStore();
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Whiche Details You want to update");
		System.out.println("[1] CompanyName \n [2] Type \n [3] MfgDate \n [4]ExpDate \n [5] Name \n [6] Composition");
		System.out.println("Please Choose any one");
		int op = scanner1.nextInt();

		switch (op) {
		case 1:

			System.out.println("Enter the updating Companyname");
			Scanner scanner = new Scanner(System.in);
			medicine.companyName = scanner.nextLine();
			medicineStore.getMedicine(medicine.companyName);
			break;
		case 2 :

			System.out.println("Enter the updating Type");
			//medicine.type = scanner1.next();
			break;

		case 3:
			System.out.println("Enter the updating Mfgdate dd/mm/yyyy");
			String date = scanner1.next();
			medicine.mfgDate = new Date(date);
			break;

		case 4:
			System.out.println("Enter the Updating Exp-date dd/mm/yyyy");
			String exdate = scanner1.next();
			medicine.ExpiryDate = new Date(exdate);
			break;

		case 5:
			System.out.println("Enter the medicine name");
			medicine.Name = scanner1.next();
			break;

		case 6:
			System.out.println("Enter the composition");
			medicine.composition =  new String[3];
			break;
		default:
			System.out.println("Your medicine details is uptodate");
		}
	}
}
