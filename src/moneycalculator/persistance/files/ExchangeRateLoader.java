package moneycalculator.persistance.files;

import moneycalculator.model.Currency;
import moneycalculator.model.ExchangeRate;

public interface ExchangeRateLoader {
    
    ExchangeRate load(Currency from, Currency to);
    
}
