package norswap.logic.ast;

import norswap.autumn.positions.Span;
import norswap.utils.Util;
import java.util.List;

// For Logic Programming
public final class RuleCallNode extends ExpressionNode
{
    public final ExpressionNode rule;
    public final List<ExpressionNode> arguments;

    @SuppressWarnings("unchecked")
    public RuleCallNode (Span span, Object rule, Object arguments) {
        super(span);
        this.rule = Util.cast(rule, ExpressionNode.class);
        this.arguments = Util.cast(arguments, List.class);
    }

    @Override public String contents ()
    {
        String args = arguments.size() == 0 ? "()" : "(...)";
        return rule.contents() + args;
    }
}
