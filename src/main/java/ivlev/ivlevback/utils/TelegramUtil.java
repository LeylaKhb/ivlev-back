package ivlev.ivlevback.utils;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

@Component
public class TelegramUtil {
    private static HttpURLConnection con;
    private static String tgToken = "6109584204:AAHt4UYB0mkAM0lZLAG23JEYbXGGclYX7K0";
    private static int  chatId = 401159350;
    private static String urlToken = "https://api.telegram.org/bot"+tgToken+"/sendMessage";

    public void sendMessage(String txt) throws IOException {

        String urlParameters = "chat_id="+chatId+"&text="+txt;
        byte[] postData = urlParameters.getBytes(StandardCharsets.UTF_8);

        try {

            URL url = new URL(urlToken);
            con = (HttpURLConnection) url.openConnection();

            con.setDoOutput(true);
            con.setRequestMethod("POST");
            con.setRequestProperty("User-Agent", "Java upread.ru client");
            con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

            try (DataOutputStream wr = new DataOutputStream(con.getOutputStream())) {
                wr.write(postData);
            }

            StringBuilder content;

            try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(con.getInputStream()))) {
                String line;
                content = new StringBuilder();

                while ((line = br.readLine()) != null) {
                    content.append(line);
                    content.append(System.lineSeparator());
                }
            }

        } finally {
            con.disconnect();
        }
    }
}
