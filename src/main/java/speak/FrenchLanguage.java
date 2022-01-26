package speak;

public class FrenchLanguage extends EnglishLanguage implements Sentences{

    @Override
    public String hello() {
        return "Bonjour,";
    }

    @Override
    public String greeting(String userName) {
        return "enchanté" + " " + userName;
    }

}
