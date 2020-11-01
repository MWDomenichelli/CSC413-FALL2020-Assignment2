package edu.csc413.statement;

public class ForStatement extends LoopStatement
{
	private final String initialization;
	private final String condition;
	private final String update;

	public ForStatement(String initialization, String condition, String update)
	{
		this.initialization = initialization;
		this.condition = condition;
		this.update = update;
	}

	@Override
	public void execute()
	{
		
	}
}
