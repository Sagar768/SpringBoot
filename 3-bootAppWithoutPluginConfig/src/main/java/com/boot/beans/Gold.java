package com.boot.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Gold {
	@Value("${type}")
	private String type;
	@Value("${price}")
	private int price;

	@Override
	public String toString() {
		return "Gold [type=" + type + ", price=" + price + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
