package com.javarush.test.level26.lesson15.big01.command;

import com.javarush.test.level26.lesson15.big01.Operation;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Павел on 31.01.2017.
 */
public class CommandExecutor
{


    private    CommandExecutor()
    {}

        private static Map<Operation, Command> map;

      static
      {
          map = new HashMap<>();
          map.put(Operation.INFO, new InfoCommand());
          map.put(Operation.DEPOSIT, new DepositCommand());
          map.put(Operation.WITHDRAW, new WithdrawCommand());
          map.put(Operation.EXIT, new ExitCommand());

      }
          public final static void execute (Operation operation){
              map.get(operation).execute();
          }








}
