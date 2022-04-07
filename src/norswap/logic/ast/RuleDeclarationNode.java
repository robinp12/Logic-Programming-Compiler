package norswap.logic.ast;

import norswap.autumn.positions.Span;
import norswap.utils.Util;
import java.util.List;

// For Logic Programming
public class RuleDeclarationNode extends DeclarationNode
{
    public final String name;
    public final List<ParameterNode> parameters;
    public final TypeNode returnType;

    @SuppressWarnings("unchecked")
    public RuleDeclarationNode
        (Span span, Object name, Object parameters) {
        super(span);
        this.name = Util.cast(name, String.class);
        this.parameters = Util.cast(parameters, List.class);
        this.returnType = new SimpleTypeNode(new Span(span.start, span.start), "Bool");
    }

    @Override public String name () {
        return name;
    }

    @Override public String contents () {
        return "rule " + name;
    }

    @Override public String declaredThing () {
        return "rule";
    }
}
