package com.example.entity;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class JavaCollection {

	private List<String> addresslist;
	
	private Set addressSet;
	
	private Map<Integer,String> addressMap;
	
	private Properties addressProperties;
	
	public List<String> getAddresslist() {
		return addresslist;
	}
	public void setAddresslist(List<String> addresslist) {
		this.addresslist = addresslist;
	}
	public Set getAddressSet() {
		return addressSet;
	}
	public void setAddressSet(Set addressSet) {
		this.addressSet = addressSet;
	}
	public Map<Integer, String> getAddressMap() {
		return addressMap;
	}
	public void setAddressMap(Map<Integer, String> addressMap) {
		this.addressMap = addressMap;
	}
	public Properties getAddressProperties() {
		return addressProperties;
	}
	public void setAddressProperties(Properties addressProperties) {
		this.addressProperties = addressProperties;
	}
	
	
	
}
