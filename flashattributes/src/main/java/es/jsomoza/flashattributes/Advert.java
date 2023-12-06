package es.jsomoza.flashattributes;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Advert {
	@NotNull
	@Size(min=2, max=30)
	private String title;
	
	@NotNull
	@Size(min=2, max=255)
	private String text;
	
	@NotNull
	@Size(min=2, max=100)
	private String contact;

	public Advert() {
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Advert [title=" + title + ", text=" + text + ", contact=" + contact + "]";
	}
}
