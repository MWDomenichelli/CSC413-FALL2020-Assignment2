package edu.csc413.statement;

public class AssignStatement extends Statement
{
	private final String variableName;
	private final int value;
	public AssignStatement(String variableName, int value)
	{
		this.variableName = variableName;
		this.value = value;
	}
	@Override
	public void run(ProgramState programState)
	{
		programState.setVariable(variableName, value);
	}
}
