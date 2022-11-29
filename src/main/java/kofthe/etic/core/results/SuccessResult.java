package kofthe.etic.core.results;

public class SuccessResult extends Result<U> {

	public SuccessResult() {
		super(true);
	}
	
	public SuccessResult(String message) {
		super(true,message);
	}
}
