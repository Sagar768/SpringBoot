package com.bootcore.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Robot {
	@Override
	public String toString() {
		return "Robot [robotName=" + robotName + ", robotModel=" + robotModel + ", robotPrice=" + robotPrice
				+ ", sensor=" + sensor + "]";
	}
	@Value("${robotName}")
	String robotName;
	public String getRobotName() {
		return robotName;
	}
	public void setRobotName(String robotName) {
		this.robotName = robotName;
	}
	public int getRobotModel() {
		return robotModel;
	}
	public void setRobotModel(int robotModel) {
		this.robotModel = robotModel;
	}
	public int getRobotPrice() {
		return robotPrice;
	}
	public void setRobotPrice(int robotPrice) {
		this.robotPrice = robotPrice;
	}
	public Sensor getSensor() {
		return sensor;
	}
	public void setSensor(Sensor sensor) {
		this.sensor = sensor;
	}
	@Value("${robotModel}")
	int robotModel;
	@Value("${robotPrice}")
	int robotPrice;
	@Autowired
	Sensor sensor;
}