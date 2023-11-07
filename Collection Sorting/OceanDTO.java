package com.xworkz.app.dto;

public class OceanDTO implements Comparable<OceanDTO> {
private String name;
private float depth;
private boolean salinity;
private String polutants;
public OceanDTO() {
}
public OceanDTO(String name, float depth, boolean salinity, String polutants) {
	super();
	this.name = name;
	this.depth = depth;
	this.salinity = salinity;
	this.polutants = polutants;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getDepth() {
	return depth;
}
public void setDepth(float depth) {
	this.depth = depth;
}
public boolean isSalinity() {
	return salinity;
}
public void setSalinity(boolean salinity) {
	this.salinity = salinity;
}
public String getPolutants() {
	return polutants;
}
public void setPolutants(String polutants) {
	this.polutants = polutants;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + Float.floatToIntBits(depth);
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((polutants == null) ? 0 : polutants.hashCode());
	result = prime * result + (salinity ? 1231 : 1237);
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	OceanDTO other = (OceanDTO) obj;
	if (Float.floatToIntBits(depth) != Float.floatToIntBits(other.depth))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (polutants == null) {
		if (other.polutants != null)
			return false;
	} else if (!polutants.equals(other.polutants))
		return false;
	if (salinity != other.salinity)
		return false;
	return true;
}
@Override
public String toString() {
	return "OceanDTO [name=" + name + ", depth=" + depth + ", salinity=" + salinity + ", polutants=" + polutants + "]";
}
@Override
public int compareTo(OceanDTO argument) {
	OceanDTO current=this;
	if(current.depth==argument.depth)
	{
	return 0;
}
	if(current.depth > argument.depth)
	{
		return 55;
	}
	if(current.depth < argument.depth) 
	{
		return -10;
	}
	throw new IllegalArgumentException("cannot compare TheatorDTO");
		
	}
		
}


