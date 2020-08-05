package com.Eragoo.MclautBot;

import com.Eragoo.MclautBot.command.Command;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MclautBot extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {
        String msg = update.getMessage().getText();
        long chatId = update.getMessage().getChatId();
        Command command = Command.parseFromString(msg);
        BotApiMethod<Message> action = command.getAction(chatId);
        executeAction(action);
    }

    private void executeAction(BotApiMethod<Message> action) {
        try {
            execute(action);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getBotUsername() {
        return BotProperties.USERNAME;
    }

    @Override
    public String getBotToken() {
        return BotProperties.TOKEN;
    }
}
