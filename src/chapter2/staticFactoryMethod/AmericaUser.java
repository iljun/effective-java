package chapter2.staticFactoryMethod;

public class AmericaUser extends RefactorUser {
    private final String language = "english";

    protected AmericaUser(String name, String email, String country) {
        super(name, email, country);
    }

    @Override
    public void language() {
        System.out.println(language);
    }
}
