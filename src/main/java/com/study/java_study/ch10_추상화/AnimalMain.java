package com.study.java_study.ch10_추상화;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog("콩이", 11, "말티즈");
        Animal tiger = new Tiger("옹이", 5, 100);

        dog.move();
        tiger.move();
    }
}



        /*Animal a = new Animal();
          Tinger t = new Tinger();
          Animal a2 = new Tinger(); 업캐스팅
          Tiger t2 = (Tiger) a2; 다운캐스팅

          단
          Animal a = new Animal();
          Tiger t= (Tiger) a;
          와
          Animal a = new Dog();
          Tiger t = (Tiger) a;
          는 불가능
          오직 Tiger를 Animal 로 업캐스팅후 나온 값으로만
          Tiger에 다운캐스팅 가능

          Animal[] animals = new Animal[3];
          Adnimal[0] = new Animal();
          Adnimal[1] = new Tiger();
          Adnimal[2] = new Dog(); 는 가능하나

          Tiger[] tigers = new Tiger[3];
          Tiger[1] = new Animal();이나
          Tiger[1] = new Dog(); 은 불가능


        */
