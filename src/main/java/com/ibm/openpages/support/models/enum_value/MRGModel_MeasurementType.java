package com.ibm.openpages.models.enum_value;

import com.ibm.openpages.models.EnumGroup;
import com.ibm.openpages.models.EnumValue;
import com.ibm.openpages.models.IEnumGroup;

import java.util.List;
import java.util.Optional;

public class MRGModel_MeasurementType {
    protected static final EnumGroup eg = new EnumGroup();

    public static final EnumValue EconomicCapital = eg.addEnumValue("Economic Capital");
    public static final EnumValue ProbabilityOfDefault = eg.addEnumValue("Probability of Default");
    public static final EnumValue LossGivenDefault = eg.addEnumValue("Loss Given Default");
    public static final EnumValue ExpectedLoss = eg.addEnumValue("Expected Loss");
    public static final EnumValue Portfolio = eg.addEnumValue("Portfolio");
    public static final EnumValue EarlyWarning = eg.addEnumValue("Early Warning");
    public static final EnumValue Forecasting = eg.addEnumValue("Forecasting");
    public static final EnumValue PricingValuation = eg.addEnumValue("Pricing Valuation");
    public static final EnumValue StressTesting = eg.addEnumValue("Stress Testing");
    public static final EnumValue Other = eg.addEnumValue("Other");
    public static final EnumValue ExposureAtDefault = eg.addEnumValue("Exposure at Default");
    public static final EnumValue RegulatoryCapital = eg.addEnumValue("Regulatory Capital");
    public static final EnumValue Macroeconomic = eg.addEnumValue("Macroeconomic");
    public static final EnumValue ALM = eg.addEnumValue("ALM");
    public static final EnumValue InternalLimits = eg.addEnumValue("Internal Limits");
    public static final EnumValue CapitalPlanning = eg.addEnumValue("Capital Planning");

    protected MRGModel_MeasurementType() {
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
