package norswap.logic.types;

public final class NullType extends Type
{
    public static final NullType INSTANCE = new NullType();
    private NullType() {}

    @Override public String name() {
        return "Null";
    }
}
