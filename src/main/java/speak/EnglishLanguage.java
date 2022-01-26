package speak;

import java.util.Date;
import java.text.SimpleDateFormat;

public class EnglishLanguage implements Sentences{

    @Override
    public String hello() {
        return "Hello,";
    }

    @Override
    public String greeting(String userName) {
        return "nice to meet you" +" " +userName;
    }

    @Override
    public String giveTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        return formatter.format(date);
    }
}
