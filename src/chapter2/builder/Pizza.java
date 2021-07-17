package chapter2.builder;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {
    protected final Set<Topping> toppings;
    protected final Size size;

    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
        size = builder.size;
    }

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
        Size size;

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        abstract Pizza build();

        protected abstract T self();
    }
}
