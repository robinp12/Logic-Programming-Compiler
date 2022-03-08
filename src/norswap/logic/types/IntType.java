package norswap.logic.types;

public final class IntType extends Type
{
    public static final IntType INSTANCE = new IntType();
    private IntType () {}

    @Override public boolean isPrimitive () {
        return true;
    }

    @Override public String name() {
        return "Int";
    }
}
