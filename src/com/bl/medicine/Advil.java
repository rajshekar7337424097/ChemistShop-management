package com.bl.medicine;

public class Advil extends Medicine{
	Advil() {
		companyName = "GSK";
		composition = new String[3];
		composition[0] = "aaaa";
		composition[1] = "bbbbb";
		composition[2] = "cccc";
		medicineType = Medicine.Type.ALLOPATHY;
		
		
	}

}
