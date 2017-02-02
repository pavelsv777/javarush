package com.javarush.test.level26.lesson15.big01.command;

import com.javarush.test.level26.lesson15.big01.ConsoleHelper;
import com.javarush.test.level26.lesson15.big01.Operation;

/**
 * Created by Павел on 31.01.2017.
 */
class InfoCommand implements Command
{

    @Override
    public void execute()
    {
        Operation op = null;

        do
        {
            op = ConsoleHelper.askOperation();
            CommandExecutor.execute(Operation.INFO);
        }
        while (op != Operation.EXIT);



    }
}

