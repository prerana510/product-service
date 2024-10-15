package com.demo.product_service.model;

import com.speedment.jpastreamer.field.DoubleField;
import com.speedment.jpastreamer.field.IntField;
import com.speedment.jpastreamer.field.StringField;

/**
 * The generated base for entity {@link Product} representing entities of the
 * {@code product}-table in the database.
 * <p> This file has been automatically generated by JPAStreamer.
 * 
 * @author JPAStreamer
 */
public final class Product$ {
    
    /**
     * This Field corresponds to the {@link Product} field "category".
     */
    public static final StringField<Product> category = StringField.create(
        Product.class,
        "category",
        Product::getCategory,
        false
    );
    /**
     * This Field corresponds to the {@link Product} field "price".
     */
    public static final DoubleField<Product> price = DoubleField.create(
        Product.class,
        "price",
        Product::getPrice,
        false
    );
    /**
     * This Field corresponds to the {@link Product} field "dimensions".
     */
    public static final StringField<Product> dimensions = StringField.create(
        Product.class,
        "dimensions",
        Product::getDimensions,
        false
    );
    /**
     * This Field corresponds to the {@link Product} field "brand".
     */
    public static final StringField<Product> brand = StringField.create(
        Product.class,
        "brand",
        Product::getBrand,
        false
    );
    /**
     * This Field corresponds to the {@link Product} field "material".
     */
    public static final StringField<Product> material = StringField.create(
        Product.class,
        "material",
        Product::getMaterial,
        false
    );
    /**
     * This Field corresponds to the {@link Product} field "stock".
     */
    public static final IntField<Product> stock = IntField.create(
        Product.class,
        "stock",
        Product::getStock,
        false
    );
    /**
     * This Field corresponds to the {@link Product} field "name".
     */
    public static final StringField<Product> name = StringField.create(
        Product.class,
        "name",
        Product::getName,
        false
    );
    /**
     * This Field corresponds to the {@link Product} field "weight".
     */
    public static final DoubleField<Product> weight = DoubleField.create(
        Product.class,
        "weight",
        Product::getWeight,
        false
    );
    /**
     * This Field corresponds to the {@link Product} field "id".
     */
    public static final IntField<Product> id = IntField.create(
        Product.class,
        "id",
        Product::getId,
        false
    );
    /**
     * This Field corresponds to the {@link Product} field "description".
     */
    public static final StringField<Product> description = StringField.create(
        Product.class,
        "description",
        Product::getDescription,
        false
    );
}