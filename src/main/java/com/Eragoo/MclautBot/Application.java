package com.Eragoo.MclautBot;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.generics.BotSession;

public class Application {
    public static void main(String[] args) throws TelegramApiRequestException {
        ApiContextInitializer.init();
        MclautBot bot = new MclautBot();
        BotSession botSession = new TelegramBotsApi().registerBot(bot);
    }
}
