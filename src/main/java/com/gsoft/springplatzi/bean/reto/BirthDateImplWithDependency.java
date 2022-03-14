package com.gsoft.SpringPlatzi.bean.reto;


public class BirthDateImplWithDependency implements BirthDateWithDependency {


  private BirthDate birthDate;

  public BirthDateImplWithDependency(BirthDate birthDate){
    this.birthDate = birthDate;
  }


  @Override
  public void printBirthYear(int age) {
    System.out.println("BirthDate Year is");
    System.out.println(birthDate.getBirthDate(age));
  }
}
