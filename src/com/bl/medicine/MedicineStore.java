//DataLayer
package com.bl.medicine;

import java.util.ArrayList;
import java.util.List;

public class MedicineStore {

	private List<Medicine> medicineList = new ArrayList();

	public List getmedicineList() {
		return medicineList;
	}

	public void add(Medicine medicine) {
		medicineList.add(medicine);
	}
	
	public void remove(Medicine medicine) {
		medicineList.remove(medicine);
	}
	
	
	public Medicine getMedicine(String medicineName) {
		for (int i = 0; i < medicineList.size(); i++) {
			if(medicineList.get(i).Name.equalsIgnoreCase(medicineName) ) {
				return medicineList.get(i);
			}
			
		}
		return null;
	}
	
}
