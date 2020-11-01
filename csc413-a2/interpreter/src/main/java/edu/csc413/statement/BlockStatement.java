package edu.csc413.statement;

import edu.csc413.interpreter.ProgramState;

/**
 * An abstract Statement type that represents a compound Statement, where running the Statement leads to a sequence of
 * other Statements to be run in order.
 */
public abstract class BlockStatement extends Statement {
    private final List<Statement> statements;
    private final Condition condition;
    public BlockStatement(Condition condition, List<Statement> statements)
    {
	this.condition = condition;
        this.statements = statements;
    }

    /**
     * Runs every statement in the BlockStatement's block. Note that for certain looping statements, this may be
     * invoked repeatedly.
     */
    protected void runBlock(ProgramState programState) {
	if(!condition.evalute()) return;
        for(Statement statement : statements)
	{
	   statement.run();
	}
    }
}
