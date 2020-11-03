package edu.csc413.statement;

public class PrintStatement extends Statement
{
	private final int value;

	public PrintStatement(int value)
	{
		this.value = value;
	}

	@Override
	public void run()
	{
		System.out.println(value);
	}
}
