package com.studentmanagementproject;

public class Address {

	private String blockNumber;
	private String streetName;
	private String unitNumber;
	private long postalCode;
	
	public Address() {
	
	}
	
	public Address(String blockNumber, String streetName, String unitNumber, long postalCode) {
		this.blockNumber = blockNumber;
		this.streetName = streetName;
		this.unitNumber = unitNumber;
		this.postalCode = postalCode;
	}

	public String getBlockNumber() {
		return blockNumber;
	}

	public void setBlockNumber(String blockNumber) {
		this.blockNumber = blockNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getUnitNumber() {
		return unitNumber;
	}

	public void setUnitNumber(String unitNumber) {
		this.unitNumber = unitNumber;
	}

	public long getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(long postalCode) {
		this.postalCode = postalCode;
	}

	@Override
	public String toString() {
		return "Address [blockNumber=" + blockNumber + ", streetName=" + streetName + ", unitNumber=" + unitNumber
				+ ", postalCode=" + postalCode + "]";
	}


}
