package kofthe.etic.core.results;

public class ErrorResult extends Result<U> {

	public ErrorResult() {
		super(false);
	}
	
	public ErrorResult(String message) {
		super(false,message);
	}
}