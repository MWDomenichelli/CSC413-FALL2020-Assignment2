package edu.csc413.expression;

import edu.csc413.interpreter.ProgramState;

public class VariableExpression extends Expression {
    private final String name;

    public VariableExpression(String name)
    {
	this.name = name;
    }

    @Override
    public int evaluate(ProgramState programState) {
        return programState.getVariable(name);
    }
}
