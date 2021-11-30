package com.bl.medicine;

import java.sql.Date;

public class Coldact extends Medicine{
	Coldact() {
		companyName = "Reddy's Lab";
		composition = new String[3];
		composition[0] = "pepper";
		composition[1] = "sugar";
		composition[2] = "salt";
		medicineType = Medicine.Type.HOMEIOPATHY;
		
	}

	public void mfgDate(int i) {
		// TODO Auto-generated method stub
		
	}
	
}
