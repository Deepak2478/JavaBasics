package com.sap.training6;

public class Computer implements Collectable{
	
	String macAddress;
	int memory;
	int cpuCores;
	
	public String getMacAddress() {
		return macAddress;
	}
	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public int getCpuCores() {
		return cpuCores;
	}
	public void setCpuCores(int cpuCores) {
		this.cpuCores = cpuCores;
	}
	@Override
	public String getUnqiqueId() {
		return macAddress;	
	}
}