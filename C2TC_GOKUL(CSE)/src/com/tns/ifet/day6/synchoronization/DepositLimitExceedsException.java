package com.tns.ifet.day6.synchoronization;

public class DepositLimitExceedsException extends Exception{
	public DepositLimitExceedsException()
	{
		super("Daily limit of Deposit is exceeded..");
	}
	public DepositLimitExceedsException(String message)
	{
		super(message);
	}
}