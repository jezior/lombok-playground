package playground;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.Value;

@Value
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class SlaveClass extends MasterClass{
    String thirdValue;

    @Builder(builderClassName = "ObjectBuilder", toBuilder = true)
    public SlaveClass(
            @Builder.ObtainVia(method = "getFirstValue") SomeComplexClass firstValue,
            @Builder.ObtainVia(method = "getSecondValue") Integer secondValue, String thirdValue) {
        super(firstValue, secondValue);
        this.thirdValue = thirdValue;
    }

    public static class ObjectBuilder extends MasterClass.ObjectBuilder<SlaveClass> { }

}
