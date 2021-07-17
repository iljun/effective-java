package chapter2.builder;

import java.util.Objects;

public class CalzonePizza extends Pizza {
    private final boolean sauceInside;

    private CalzonePizza(Builder builder) {
        super(builder);
        sauceInside = builder.sauceInside;
    }

    public static class Builder extends Pizza.Builder<Builder> {
        private boolean sauceInside = false;

        public Builder sauceInside() {
            sauceInside = true;
            return this;
        }

        public Builder(Size size) {
            super(size);
        }

        @Override
        Pizza build() {
            return new CalzonePizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
}
