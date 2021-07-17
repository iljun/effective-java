package chapter2.staticFactoryMethod;

public abstract class RefactorUser {
    protected final String name;
    protected final String email;
    protected final String country;

    // static method를 이용하여 객체를 생성하도록 construct는 protected으로 선언해 static method에서만 사용 가능하게 변경
    // 상속할 수 없다는 단점을 커버하기 위해서 protected를 사용
    protected RefactorUser(final String name,
                final String email,
                final String country) {
        this.name = name;
        this.email = email;
        this.country = country;
    }

    // static method를 이용해 기본 국가를 가질 수 있도록 설정
    public static RefactorUser createWithDefaultCountry(final String name,
                                                        final String email) {
        return new KoreaUser(name, email, "Korea");
    }

    // static method를 이용해 미국 User를 생성하는 method 정의
    public static RefactorUser createAmericaUser(final String name,
                                                final String email) {
        return new AmericaUser(name, email, "USA");
    }

    public abstract void language();
}
