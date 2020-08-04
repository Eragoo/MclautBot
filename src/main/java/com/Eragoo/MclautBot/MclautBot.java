package com.Eragoo.MclautBot;

import lombok.SneakyThrows;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

public class MclautBot extends TelegramLongPollingBot {

    @SneakyThrows
    @Override
    public void onUpdateReceived(Update update) {
        String msg = update.getMessage().getText();
        if ("/start".equals(msg)) {
            SendMessage message = new SendMessage(update.getMessage().getChatId(), "Hello");
            execute(message);
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
