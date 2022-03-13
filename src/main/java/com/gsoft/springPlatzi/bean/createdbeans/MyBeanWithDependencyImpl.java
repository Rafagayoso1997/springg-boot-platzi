package com.gsoft.springPlatzi.bean;

public class MyBeanWithDependencyImpl implements MyBeanWithDependency{

  private MyOperation myOperation;

  public MyBeanWithDependencyImpl(MyOperation myOperation) {
    this.myOperation = myOperation;
  }

  @Override
  public void printWithDependency() {
    int number = 10;
    System.out.println(myOperation.sum(number));
    System.out.println("Mi bean con dependencies");
  }
}
