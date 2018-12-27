package org.javabrains.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class JavaCollections {
	private List<String> addressList;
	private Set<String> addressSet;
	private Map<String, String> addressMap;
	
	// similar to Map<K, V>, But contains Key as String & Values as String too
	private Properties addressProp;
	
	public List<String> getAddressList() {
		System.out.println("List : "+addressList);
		return addressList;
	}
	
	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
	}
	public Set<String> getAddressSet() {
		System.out.println("Set : "+addressSet);
		return addressSet;
	}
	public void setAddressSet(Set<String> addressSet) {
		this.addressSet = addressSet;
	}
	public Map<String, String> getAddressMap() {
		System.out.println("Map : "+addressMap);
		return addressMap;
	}
	public void setAddressMap(Map<String, String> addressMap) {
		this.addressMap = addressMap;
	}
	public Properties getAddressProp() {
		System.out.println("Properties : "+addressProp);
		return addressProp;
	}
	public void setAddressProp(Properties addressProp) {
		this.addressProp = addressProp;
	}
}
