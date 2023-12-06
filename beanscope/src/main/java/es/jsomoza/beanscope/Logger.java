package es.jsomoza.beanscope;

public class Logger {
	private String prefix;

	public Logger() {
		prefix = "Log> ";
		log("Logger was instantiated");
	}

	public void log(String message) {
		System.out.println(prefix + message);
	}

	@Override
	public String toString() {
		return "Llamada a logger";
	}
}
