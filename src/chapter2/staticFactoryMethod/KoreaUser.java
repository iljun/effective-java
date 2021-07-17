package chapter2.staticFactoryMethod;

public class KoreaUser extends RefactorUser {
    private String language = "korean";

    protected KoreaUser(String name, String email, String country) {
        super(name, email, country);
    }

    @Override
    public void language() {
        System.out.println(language);
    }
}
