package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.app.dto.SaloonItemDTO;

public class SaloonItemRunner {

	public static void main(String[] args) {
System.out.println("invoking main in SaloonItemRunner");
SaloonItemDTO dto1=new SaloonItemDTO(1,"Scissor",100,"Cutting",true);
SaloonItemDTO dto2=new SaloonItemDTO(2,"HairSpa",200,"HairWash",false);
SaloonItemDTO dto3=new SaloonItemDTO(3,"Hair Color",300,"coloring",true);
SaloonItemDTO dto4=new SaloonItemDTO(4,"Razor",400,"Shaving",false);
SaloonItemDTO dto5=new SaloonItemDTO(5,"FacialPack",500,"Facial",true);
SaloonItemDTO dto6=new SaloonItemDTO(6,"NailArt",600,"Nails",false);
SaloonItemDTO dto7=new SaloonItemDTO(7,"HairCut",700,"Style",true);
SaloonItemDTO dto8=new SaloonItemDTO(8,"Pedicure",800,"Massag",false);
SaloonItemDTO dto9=new SaloonItemDTO(9,"Hair Extension",900,"styling",true);
SaloonItemDTO dto10=new SaloonItemDTO(10,"Steamers",1000,"Treatment",false);
Collection<SaloonItemDTO> saloon=new ArrayList();
saloon.add(dto1);
saloon.add(dto2);
saloon.add(dto3);
saloon.add(dto4);
saloon.add(dto5);
saloon.add(dto6);
saloon.add(dto7);
saloon.add(dto8);
saloon.add(dto9);
saloon.add(dto10);
System.out.println("Saloon Items:"+saloon.size());
Iterator<SaloonItemDTO>itr=saloon.iterator();
int count=0;
for(SaloonItemDTO saloonItem:saloon) {
	if(saloonItem.getName().contains("P")) {
		System.out.println("SaloonItemName:"+saloonItem.getName());
		count++;
	}
}
System.out.println("Count is:"+count);
Collection<SaloonItemDTO> containsCollection=new ArrayList();
SaloonItemDTO dto11=new SaloonItemDTO(5,"FacialPack",500,"Facial",true);
SaloonItemDTO dto12=new SaloonItemDTO(6,"NailArt",600,"Nails",false);
containsCollection.add(dto11);
containsCollection.add(dto12);
 
boolean ref1=saloon.containsAll(containsCollection);
System.out.println("ContainsAll :"+ref1);

boolean ref2=saloon.remove(dto12);
System.out.println("Remove:+ref2");
System.out.println("Remove size is"+saloon.size());

Collection<SaloonItemDTO> removeCollection=new ArrayList();
SaloonItemDTO dto13=new SaloonItemDTO(5,"FacialPack",500,"Facial",true);
SaloonItemDTO dto14=new SaloonItemDTO(6,"NailArt",600,"Nails",false);
containsCollection.add(dto13);
containsCollection.add(dto14);
boolean ref3=saloon.removeAll(removeCollection);
System.out.println("RemoveAll :"+ref3); 
System.out.println("Remove all size is"+saloon.size());

	}

}
