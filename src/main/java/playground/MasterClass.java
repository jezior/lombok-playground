package playground;

import lombok.Builder;
import lombok.Value;
import lombok.experimental.NonFinal;

@Value
@NonFinal
public class MasterClass {
    protected final SomeComplexClass firstValue;
    protected final Integer secondValue;

    @Builder(builderClassName = "ObjectBuilder", toBuilder = true)
    public MasterClass(SomeComplexClass firstValue, Integer secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public static class ObjectBuilder<T> {
        public ObjectBuilder() {
        }

        public T build() {
            return null;
        }
    }
}
