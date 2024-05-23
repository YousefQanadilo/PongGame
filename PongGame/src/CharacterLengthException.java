
public class CharacterLengthException extends Exception{

	String message;
	CharacterLengthException(String message){
		
		this.message = message;
		
	}
	
	
	public String getMessage() {
		
		return message;
	}
}
