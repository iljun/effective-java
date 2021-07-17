package chapter2.staticFactoryMethod;

public class Main {

    public static void main(String[] args) {
        // 일반적인 생성자 사용
        User user = new User("firstName", "fistName@google.com", "korea");

        RefactorUser defaultCountryUser = RefactorUser.createWithDefaultCountry("iljun", "sumusb34@gmail.com");
        defaultCountryUser.language();

        RefactorUser americaUser = RefactorUser.createAmericaUser("ethan", "sumusb34@gmail.com");
        americaUser.language();
    }
}
