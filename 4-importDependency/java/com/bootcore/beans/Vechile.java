package com.bootcore.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Vechile {
	@Value("${type}")
	String type;
	@Value("${model}")
	int model;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Vechile [type=" + type + ", model=" + model + "]";
	}
}
