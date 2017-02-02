package com.javarush.test.level26.lesson15.big01;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Asus on 21.01.2017.
 */
public class CurrencyManipulator
{
    private  String currencyCode =null;
    Map<Integer, Integer> denominations;

    public String getCurrencyCode()
    {
        return currencyCode;
    }

    public CurrencyManipulator(String currencyCode)
    {
        this.currencyCode = currencyCode;
        denominations = new HashMap<>();
    }

  public   void addAmount(int denomination, int count) {
        if (denominations.containsKey(denomination)) {
            denominations.put(denomination, denominations.get(denomination) + count);
        } else {
            denominations.put(denomination, count);
        }
    }

public int getTotalAmount(){

        int count = 0;
        for(Map.Entry<Integer,Integer> entry: denominations.entrySet()){
            count = count + (entry.getKey()*entry.getValue());
        }
        return count;
    }
}





