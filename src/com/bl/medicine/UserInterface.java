package com.bl.medicine;

import java.util.List;

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
}
