package norswap.logic.ast;

import norswap.autumn.positions.Span;

public abstract class ExpressionNode extends LogicNode
{
    public ExpressionNode (Span span) {
        super(span);
    }
}
