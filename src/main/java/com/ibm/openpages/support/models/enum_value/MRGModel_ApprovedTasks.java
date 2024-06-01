package com.ibm.openpages.support.models.enum_value;

import com.ibm.openpages.support.models.EnumGroup;
import com.ibm.openpages.support.models.EnumValue;
import com.ibm.openpages.support.models.IEnumGroup;

import java.util.List;
import java.util.Optional;

public class MRGModel_ApprovedTasks {
    protected static final EnumGroup eg = new EnumGroup();

    public static final EnumValue Summarization = eg.addEnumValue("Summarization");
    public static final EnumValue Classification = eg.addEnumValue("Classification");
    public static final EnumValue QuestionAnswering = eg.addEnumValue("Question Answering");
    public static final EnumValue Generation = eg.addEnumValue("Generation");
    public static final EnumValue CodeGenerationAndConversion = eg.addEnumValue("Code Generation And Conversion");
    public static final EnumValue Extraction = eg.addEnumValue("Extraction");
    public static final EnumValue RetrievalAugmentedGeneration = eg.addEnumValue("Retrieval-Augmented Generation");

    protected MRGModel_ApprovedTasks() {
    }
    
    public static List<EnumValue> values() {
        return eg.values();
    }

    public static Optional<EnumValue> lookup(String value) {
        return eg.lookup(value);
    }

    public static IEnumGroup instance() {
        return eg;
    }
}
