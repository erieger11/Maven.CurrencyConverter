package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class CanadianDollar implements ConvertableCurrency {
    public Double convert(CurrencyType currencyType){
        double targetCurrencyRate = CurrencyType.CANADIAN_DOLLAR.getRate();
        double currentCurrencyRate = currencyType.getRate();
        return currentCurrencyRate / targetCurrencyRate;
    }
}
