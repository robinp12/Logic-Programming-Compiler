package norswap.logic.ast;

import norswap.autumn.positions.Span;
import norswap.utils.Util;
import java.util.List;

public class RuleDeclarationNode extends DeclarationNode
{
    public final String name;
    public final List<ParameterNode> parameters;
    public final TypeNode returnType;
    public final BlockNode block;

    @SuppressWarnings("unchecked")
    public RuleDeclarationNode
        (Span span, Object name, Object parameters, Object returnType, Object block) {
        super(span);
        this.name = Util.cast(name, String.class);
        this.parameters = Util.cast(parameters, List.class);
        this.returnType = new SimpleTypeNode(new Span(span.start, span.start), "Bool");
        this.block = Util.cast(block, BlockNode.class);
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
