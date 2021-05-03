package ru.netology.domain;

import java.util.Objects;

public class Smartphone extends Product {
    private String creator;

    public Smartphone(int id, String name, int price, String creator) {
        super(id, name, price);
        this.creator = creator;
    }

    public String getCreator() {
        return creator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Smartphone that = (Smartphone) o;
        return creator.equals(that.creator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), creator);
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "id=" + super.getId() + ", " +
                "name=" + super.getName() + ", " +
                "price=" + super.getPrice() + ", " +
                //  "author=" + getBook() +
                '}';
    }

}