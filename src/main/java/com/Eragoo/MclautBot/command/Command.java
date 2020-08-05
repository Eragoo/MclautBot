package com.Eragoo.MclautBot.command;

import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Message;

public interface Command {
    BotApiMethod<Message> getAction(long chatId);

    static Command parseFromString(String text) {
        return CommandsFactory.parseCommand(text);
    }
}
