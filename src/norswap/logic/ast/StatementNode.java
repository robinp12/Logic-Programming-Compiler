package norswap.logic.ast;

import norswap.autumn.positions.Span;

public abstract class StatementNode extends LogicNode {
    public StatementNode (Span span) {
        super(span);
    }
}
