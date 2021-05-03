package ru.netology.repository;

import ru.netology.domain.Product;

public class ProductRepository {
    private Product[] products = new Product[0];

    public void save(Product item) {
        int len = products.length + 1;
        Product[] tmp = new Product[len];
        System.arraycopy(products, 0, tmp, 0, products.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        products = tmp;
    }

    public Product[] findAll() {
        return products;

    }
    public void removeById(int id) {
        Product[] tmp = new Product[products.length - 1];
        int i = 0;
        for (Product item : products) {
            if (item.getId() != id) {
                tmp[i] = item;
                i++;
            }
        }
        products =tmp;
    }

}