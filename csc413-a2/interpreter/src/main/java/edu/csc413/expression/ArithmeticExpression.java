package edu.csc413.expression;

import edu.csc413.interpreter.ProgramState;

/** An Expression representing the combination of two smaller expressions, combined with an arithmetic operator. */
public class ArithmeticExpression extends Expression {
    /** The various operators that can be used to combine smaller expressions into an ArithmeticOperator. */
    public enum Operator {
        ADD("+", 1),
        SUBTRACT("-", 1),
        MULTIPLY("*", 2),
        DIVIDE("/", 2),
        REMAINDER("%", 2),
        POWER("^", 3);

        private final String symbol;
        private final int precedence;

        Operator(String symbol, int precedence) {
            this.symbol = symbol;
            this.precedence = precedence;
        }

        String getSymbol() {
            return symbol;
        }

        int getPrecedence() {
            return precedence;
        }
    }

    private final Operator operator;
    private final Expression lhs;
    private final Expression rhs;

    public ArithmeticExpression(Operator operator, Expression lhs, Expression rhs)
    {
	this.operator = operator;
	this.lhs = lhs;
	this.rhs = rhs;
    }

    @Override
    public int evaluate(ProgramState programState) {
        int lhsValue = lhs.evaluate(programState);
	int rhsValue = rhs.evaluate(programState);
	switch(operator)
	{
	   case ADD: return lhsValue + rhsValue;
	   case SUBTRACT: return lhsValue - rhsValue;
  	   case MULTIPLY: return lhsValue * rhsValue;
           case DIVIDE: return lhsValue / rhsValue;
	}
    }
}
