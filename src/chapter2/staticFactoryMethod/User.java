package chapter2.staticFactoryMethod;

public class User {
    private final String name;
    private final String email;
    private final String country;

    // 일반적인 생성자를 이용하는 객체
    // 생성자만으로는 생성되는 객체의 표현이 부족하다.
    public User(final String name,
                final String email,
                final String country) {
        this.name = name;
        this.email = email;
        this.country = country;
    }
}
