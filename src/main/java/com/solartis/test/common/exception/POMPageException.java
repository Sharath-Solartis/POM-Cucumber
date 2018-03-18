package com.solartis.test.common.exception;

public class POMPageException extends Exception
{
	
	private static final long serialVersionUID = 1L;

	public POMPageException(String message) 
	{
        super(message);
    }

    public POMPageException(String message, Throwable throwable) 
    {
        super(message, throwable);
    }
    
    public POMPageException(Exception e) 
    {
        super(e);
    }

    public POMPageException(String message, Exception e) 
    {
        super(message, e);
    }


}
