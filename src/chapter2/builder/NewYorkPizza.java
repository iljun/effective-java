package chapter2.builder;

public class NewYorkPizza extends Pizza {
    private final boolean containSalt;

    private NewYorkPizza(Builder builder) {
        super(builder);
        this.containSalt = builder.containSalt;
    }

    public static class Builder extends Pizza.Builder<Builder> {
        private final boolean containSalt;

        public Builder(Size size,
                       boolean containSalt) {
            super(size);
            this.containSalt = containSalt;
        }

        @Override
        NewYorkPizza build() {
            return new NewYorkPizza(this);
        }

        @Override protected Builder self() { return this; }
    }
}
