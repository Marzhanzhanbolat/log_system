import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    // Уақыт форматы
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    // Лог жазу функциясы
    public static void log(String type, String message) {
        try {
            FileWriter writer = new FileWriter("log.txt", true);

            String time = LocalDateTime.now().format(formatter);
            writer.write("[" + time + "] [" + type + "] " + message + "\n");

            writer.close();
        } catch (IOException e) {
            System.out.println("Log жазу кезінде қате шықты");
        }
    }

    public static void main(String[] args) {

        // Әртүрлі әрекеттер
        log("INFO", "Бағдарлама іске қосылды");
        log("LOGIN", "Пайдаланушы жүйеге кірді");
        log("UPDATE", "Деректер өзгертілді");
        log("ERROR", "Қате орын алды");

    }
}
