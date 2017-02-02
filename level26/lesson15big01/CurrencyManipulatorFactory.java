package com.javarush.test.level26.lesson15.big01;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Asus on 21.01.2017.
 */
public  class CurrencyManipulatorFactory
{
    private static Map<String, CurrencyManipulator> map = new HashMap<>();

    private CurrencyManipulatorFactory()
    {
    }

    static CurrencyManipulator getManipulatorByCurrencyCode(String currencyCode) {
        for (Map.Entry<String, CurrencyManipulator> manipulator : map.entrySet()) {
            if (manipulator.getValue().getCurrencyCode().equals(currencyCode)) {
                return manipulator.getValue();
            }
        }
        CurrencyManipulator manipulator = new CurrencyManipulator(currencyCode);
        map.put(currencyCode, manipulator);
        return manipulator;
    }


}
