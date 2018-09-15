package pl.sdacademy.store.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MyClass {


    private final MyPlainClass myPlainClass;
    private int counter = 0;

    @Autowired
    public MyClass (MyPlainClass myPlainClass){
        this.myPlainClass=myPlainClass;
        System.out.println("===MyClass  constructor===");
    }


    @PostConstruct
    public void init(){
        myPlainClass.hello();
    }


    public int getCounter(){
        return counter++;
    }

    public void makeZero() {
        counter = 0;
    }

    public void setCounter(Integer number) {
        counter = number;
    }


}
