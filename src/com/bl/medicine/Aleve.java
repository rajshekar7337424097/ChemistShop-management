package com.bl.medicine;

import com.bl.medicine.Medicine.Type;

public class Aleve extends Medicine{
	Aleve(){
		Name = "Aleve";
		companyName = "Mankind";
		composition = new String[3];
		composition[0] = "rosie ";
		composition[1] = "prufine";
		composition[2] = "paramine";
		medicineType = Type.HOMEIOPATHY;
		
	}

}
