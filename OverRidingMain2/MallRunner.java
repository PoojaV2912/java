package OverRidingMain2;

import com.xworkz.Shop;

import OverRiding2.Mall;

public class MallRunner {

	public static void main(String[] args) {
			System.out.println("Invoking main in Hostel Killer");
			Mall mall = new Mall();
			mall.mallInfo();
			mall.mallInfo(1000);
			mall.mallInfo("LULU");
			Mall mall1=new Shop();
			mall1.mallInfo();
			mall.mallInfo(1200);
			mall.mallInfo("Super");
		}

	}
	