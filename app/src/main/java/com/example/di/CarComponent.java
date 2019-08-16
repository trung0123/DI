package com.example.di;

import dagger.Component;

@Component
public interface CarComponent {

    Car getCar();

    void inject(MainActivity activity);
}
