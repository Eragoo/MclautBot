package com.Eragoo.MclautBot.command;

import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;

public class StartCommand implements Command{
    public static final Commands NAME = Commands.START;
    private static final String TEXT = "Start command text";

    @Override
    public BotApiMethod<Message> getAction(long chatId) {
        return new SendMessage(chatId, TEXT);
    }
}
