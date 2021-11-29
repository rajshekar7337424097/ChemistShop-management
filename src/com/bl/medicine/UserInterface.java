package com.bl.medicine;

import java.util.List;

public class UserInterface {
	public void print(List list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
