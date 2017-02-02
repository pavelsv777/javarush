package com.javarush.test.level26.lesson15.big01;


import java.util.Locale;

/**
 * Created by Asus on 20.01.2017.
 */
public class CashMachine
{


    public static void main(String[] args)
    {
    /*    Locale.setDefault(Locale.ENGLISH);

        Operation op = Operation.DEPOSIT;
        switch (op) {
            case DEPOSIT: {
                try {
                    String curCode = ConsoleHelper.askCurrencyCode();
                    String[] str = ConsoleHelper.getValidTwoDigits(curCode);
                    CurrencyManipulatorFactory.getManipulatorByCurrencyCode(curCode).addAmount(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
                    CurrencyManipulatorFactory.getManipulatorByCurrencyCode(curCode).getTotalAmount();

                } catch (NumberFormatException ex) {
                    ex.printStackTrace();
                }
            }
        }
    */

        Locale.setDefault(Locale.ENGLISH);
        Operation op = null;

        do
        {
            op = ConsoleHelper.askOperation();

        }
        while (op != Operation.EXIT);


    }
}
