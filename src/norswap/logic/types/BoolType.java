package norswap.logic.types;

public final class BoolType extends Type
{
    public static final BoolType INSTANCE = new BoolType();
    private BoolType () {}

    @Override public boolean isPrimitive () {
        return true;
    }

    @Override public String name() {
        return "Bool";
    }
}