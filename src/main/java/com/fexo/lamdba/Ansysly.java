package com.fexo.lamdba;

import org.junit.Test;

public class Ansysly {

   static Peapen jack = () -> {
        System.out.println("jack eat");
    };
  static   Peapen rose = () -> {
        System.out.println("rose eat");
    };

    static {
        jack.eat();
        rose.eat();
    }

    @Test
    public  void main(){

    }

}
