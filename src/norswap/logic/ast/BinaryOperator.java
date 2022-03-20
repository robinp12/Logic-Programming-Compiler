package norswap.logic.ast;

public enum BinaryOperator
{
    MULTIPLY("*"),
    DIVIDE("/"),
    REMAINDER("%"),
    ADD("+"),
    SUBTRACT("-"),
    EQUALITY("=="),
    NOT_EQUALS("!="),
    GREATER(">"),
    LOWER("<"),
    GREATER_EQUAL(">="),
    LOWER_EQUAL("<="),
    AND("&&"),
    OR("||"),
    XOR("^"),
    NAND("!&&"),
    NOR("!||"),
    IMPLIC("->") ,
    EQUIV("<=>") ;


    public final String string;

    BinaryOperator (String string) {
        this.string = string;
    }
}