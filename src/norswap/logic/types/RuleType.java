package norswap.logic.types;

import norswap.utils.NArrays;
import java.util.Arrays;

// For Logic Programming
public final class RuleType extends Type
{
    public final Type returnType;
    public final Type[] paramTypes;

    public RuleType (Type returnType, Type... paramTypes) {
        this.returnType = returnType;
        this.paramTypes = paramTypes;
    }

    @Override public String name() {
        String[] params = NArrays.map(paramTypes, new String[0], Type::name);
        return String.format("(%s) -> %s", String.join(",", params), returnType);
    }

    @Override public boolean equals (Object o) {
        if (this == o) return true;
        if (!(o instanceof RuleType)) return false;
        RuleType other = (RuleType) o;

        return returnType.equals(other.returnType)
                && Arrays.equals(paramTypes, other.paramTypes);
    }

    @Override public int hashCode () {
        return 31 * returnType.hashCode() + Arrays.hashCode(paramTypes);
    }
}
