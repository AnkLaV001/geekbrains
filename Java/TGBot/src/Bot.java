import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingBot {
    private long chat_id;

    @Override
    public void onUpdateReceived(Update update) {
        update.getUpdateId();

        SendMessage sendMessage = new SendMessage().setChatId(update.getMessage().getChatId());
        chat_id = update.getMessage().getChatId();

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String getBotUsername() {
        return "@RuBoardGameBot";
    }

    @Override
    public String getBotToken() {
        return "1626341976:AAG9i48Yyk-nlRud4LZ9DArSK9Bzpir2EDI";
    }

    public String input(String msg) {
        if (msg.contains("Привет") || msg.contains("Hello")) {
            return "Hello";
        }
        return msg;
    }
}

