package feb;

public class AgeException extends Exception {
	private String msg;
	public AgeException(String message) {
		msg=message;
	}
	public String getMessage() {
		return msg;
	}

	}


