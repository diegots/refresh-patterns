package com.company.abstract_factory;

public interface AbstractFactory<T> {
    T create(String objectType);
}
