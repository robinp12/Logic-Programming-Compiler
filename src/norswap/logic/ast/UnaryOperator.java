package norswap.logic.ast;

public enum UnaryOperator
{
    NOT("!");

    public final String string;

    UnaryOperator (String string) {
        this.string = string;
    }
}
