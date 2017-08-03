package de.nsattes.hottahue.spring.model;

public class HelloModel {

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
