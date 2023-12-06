package es.jsomoza.validacion;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Comment {
	@NotNull(message="No puede estar vacio")
	@Size(min=2, max=30, message="tiene que tener más de 2 caracteres y menos de 30")
	private String user;
	
	@NotNull
	@Size(min=2, max=255)
	private String text;
	   
    @NotNull
    @Min(0)
    @Max(10)
	private Integer mark;
	
	public Comment () {}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Integer getMark() {
		return mark;
	}

	public void setMark(Integer mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Comment [user=" + user + ", text=" + text + ", mark=" + mark + "]";
	}
}
