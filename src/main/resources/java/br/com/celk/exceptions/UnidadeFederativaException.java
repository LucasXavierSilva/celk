package br.com.celk.exceptions;

/**
 * @author Lucas
 *
 */
public class UnidadeFederativaException extends Exception {
	private static final long serialVersionUID = 7718828512143293558L;
	private int errorCode;
	private String errorMessage;

	public UnidadeFederativaException(Throwable throwable) {
	        super(throwable);
	    }

	public UnidadeFederativaException(String msg, Throwable throwable) {
	        super(msg, throwable);
	    }

	public UnidadeFederativaException(String msg) {
	        super(msg);
	    }

	public UnidadeFederativaException(String message, int errorCode) {
	        super();
	        this.errorCode = errorCode;
	        this.errorMessage = message;
	    }

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	@Override
	public String toString() {
		return this.errorCode + " : " + this.getErrorMessage();
	}
}