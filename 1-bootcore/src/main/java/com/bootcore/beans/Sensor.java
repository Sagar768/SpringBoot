package com.bootcore.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Sensor {
	@Value("${sensorName}")
	String sensorName;

	public String getSensorName() {
		return sensorName;
	}

	public void setSensorName(String sensorName) {
		this.sensorName = sensorName;
	}

	public int getSensorMemory() {
		return sensorMemory;
	}

	public void setSensorMemory(int sensorMemory) {
		this.sensorMemory = sensorMemory;
	}

	public int getSensorCpu() {
		return sensorCpu;
	}

	@Override
	public String toString() {
		return "Sensor [sensorName=" + sensorName + ", sensorMemory=" + sensorMemory + ", sensorCpu=" + sensorCpu + "]";
	}

	public void setSensorCpu(int sensorCpu) {
		this.sensorCpu = sensorCpu;
	}

	@Value("${sensorMemory}")
	int sensorMemory;
	@Value("${sensorCpu}")
	int sensorCpu;
}