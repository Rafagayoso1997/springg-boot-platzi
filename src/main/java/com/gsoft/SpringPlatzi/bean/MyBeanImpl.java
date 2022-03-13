package com.gsoft.SpringPlatzi.bean;

public class MyBeenImpl implements MyBean {

  @Override
  public void print() {
    System.out.println("Hola desde mi implementación propia del bean");
  }
}
