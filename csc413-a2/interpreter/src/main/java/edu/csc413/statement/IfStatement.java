package edu.csc413.statement;

public class IfStatement extends BlockStatement
{
	public IfStatement(Condition condition, List<Statement> statements)
	{
		super(condition, statements);
	}

	@Override
	public void execute()
	{
		runBlock();
	}
}
