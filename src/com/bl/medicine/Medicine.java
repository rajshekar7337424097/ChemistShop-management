package com.bl.medicine;

import java.sql.Date;
import java.util.Arrays;

public class Medicine {
		String brand;
		Date mfgDate;
		Date ExpiryDate;
		String[] composition;
		
		@Override
		public String toString() {
			return "Medicine [brand=" + brand + ", mfgDate=" + mfgDate + ", ExpiryDate=" + ExpiryDate + ", composition="
					+ Arrays.toString(composition) + "]";
		}
}
