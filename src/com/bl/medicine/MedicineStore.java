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
}
