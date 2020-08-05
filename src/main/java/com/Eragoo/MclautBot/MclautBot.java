package com.Eragoo.MclautBot;

import com.Eragoo.MclautBot.command.Command;
import lombok.SneakyThrows;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

public class MclautBot extends TelegramLongPollingBot {

    @SneakyThrows
    @Override
    public void onUpdateReceived(Update update) {
        String msg = update.getMessage().getText();
        long chatId = update.getMessage().getChatId();
        Command command = Command.parseFromString(msg);
        BotApiMethod<Message> action = command.getAction(chatId);
        execute(action);
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
