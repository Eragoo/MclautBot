package com.Eragoo.MclautBot.command;

import com.Eragoo.MclautBot.error.UnexpectedCommandException;

public class CommandsFactory {

    public static Command parseCommand(String text) {
        if (text.startsWith(Commands.START.getName())) {
            return new StartCommand();
        } else {
            throw new UnexpectedCommandException("String " + text + " not matches with available commands");
        }
    }
}
