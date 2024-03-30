package com.ibm.openpages.models.field_group;

import com.ibm.openpages.models.Field;
import com.ibm.openpages.models.FieldGroup;
import com.ibm.openpages.support.util.FieldType;

public interface OPSS_BE {
    FieldGroup fg_OPSS_BE = new FieldGroup("OPSS-BE");

    Field AccountAssets = fg_OPSS_BE.addField("AccountAssets", "Account Assets", FieldType.Currency);
    Field AccountEquity = fg_OPSS_BE.addField("AccountEquity", "Account Equity", FieldType.Currency);
    Field AccountExpenses = fg_OPSS_BE.addField("AccountExpenses", "Account Expenses", FieldType.Currency);
    Field AccountLiabilities = fg_OPSS_BE.addField("AccountLiabilities", "Account Liabilities", FieldType.Currency);
    Field AccountRevenue = fg_OPSS_BE.addField("AccountRevenue", "Account Revenue", FieldType.Currency);
    Field AccountTotals = fg_OPSS_BE.addField("Account Totals", FieldType.Currency);
    Field AccountUnknown = fg_OPSS_BE.addField("AccountUnknown", "Account Unknown", FieldType.Currency);
    Field AnnualRevenue = fg_OPSS_BE.addField("AnnualRevenue", "Annual Revenue", FieldType.Currency);
}
