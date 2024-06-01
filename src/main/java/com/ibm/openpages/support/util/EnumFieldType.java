package com.ibm.openpages.support.util;

import com.ibm.openpages.api.resource.IEnumField;
import com.ibm.openpages.support.models.EnumValue;
import com.ibm.openpages.support.models.IEnumGroup;

import java.util.List;
import java.util.Optional;

public class EnumFieldType extends FieldType<IEnumField> {
    private final IEnumGroup enumGroup;

    protected EnumFieldType(IEnumGroup enumGroup) {
        super(IEnumField.class);

        this.enumGroup = enumGroup;
    }

    public static EnumFieldType from(IEnumGroup enumGroup) {
        return new EnumFieldType(enumGroup);
    }

    public List<EnumValue> values() {
        return enumGroup.values();
    }

    public Optional<EnumValue> lookup(String value) {
        return enumGroup.lookup(value);
    }

    public IEnumGroup getEnumGroup() {
        return enumGroup;
    }
}
