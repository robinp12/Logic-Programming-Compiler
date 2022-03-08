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

    /* Features added for logic programming*/
    XOR("^"),
    NAND("&-&"),
    NOR("|-|");


    public final String string;

    BinaryOperator (String string) {
        this.string = string;
    }
}