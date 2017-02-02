package com.javarush.test.level26.lesson15.big01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Asus on 20.01.2017.
 */
public  class ConsoleHelper
{
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message)
    {
        System.out.println(message);
    }

    public static String readString()
    {
        String line = null;
        try
        {
            line = reader.readLine();
        }
        catch (IOException e)
        {
        }
        return line;
    }


    public   static  String askCurrencyCode(){


      String corCode = null;

      while (true)
      {
          writeMessage("Input currency code:");
          corCode = readString();
          if (corCode.length() != 3) writeMessage("Error code");
            else  {
                corCode = corCode.toUpperCase();

            return corCode; }
      }
  }
    public  static   String[] getValidTwoDigits(String currencyCode){

        while (true) {
            writeMessage("Введите два целых положительных числа. Первое - номинал, второе - количество банкнот: ");
            String userInput = readString();
            String[] strmas = userInput.split(" ");
            try {
                if (strmas.length == 2 && Integer.parseInt(strmas[0]) >= 0 && Integer.parseInt(strmas[1]) >= 0) {
                    return strmas;
                } else {
                    writeMessage("Введены неверные данные, повторите ввод!");
                }
            }catch (NumberFormatException ex) {
                writeMessage("Введены неверные данные, повторите ввод!");
            }
        }
    }

   public static   Operation askOperation(){
       boolean correctInput = false;
       Operation chosenOperation = Operation.INFO;

       while (!correctInput) {
           writeMessage("Выберите вашу операцию 1 - INFO, 2 - DEPOSIT, 3 - WITHDRAW, 4 - EXIT: ");
           String input = readString();
           int choise;

           try {
               choise = Integer.parseInt(input.trim());
               chosenOperation = Operation.getAllowableOperationByOrdinal(choise);
               correctInput = true;
           } catch (NumberFormatException e) {writeMessage(e.getMessage());
           }
            catch (IllegalArgumentException  e){  writeMessage(e.getMessage());}

       }

       return chosenOperation;

   }



}
