package de.nsattes.hottahue.spring.model;

import com.fasterxml.jackson.annotation.JsonView;

public class HelloModel {

	//TODO JsonView anlegen
	@JsonView
	private String text;

	public HelloModel() {
		this.text = "Hallo Welt";
	}

	public HelloModel(String name) {
		this.text = "Hallo " + name + "!";
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
