package norswap.logic.ast;

import norswap.autumn.positions.Span;
import norswap.utils.Util;
import java.util.List;

public class FactDeclarationNode extends DeclarationNode
{
    public final String name;
    public final List<ParameterNode> parameters;

    @SuppressWarnings("unchecked")
    public FactDeclarationNode
            (Span span, Object name, Object parameters) {
        super(span);
        this.name = Util.cast(name, String.class);
        this.parameters = Util.cast(parameters, List.class);
    }

    @Override public String name () {
        return name;
    }

    @Override public String contents () {
        return "fun " + name;
    }

    @Override public String declaredThing () {
        return "function";
    }
}
