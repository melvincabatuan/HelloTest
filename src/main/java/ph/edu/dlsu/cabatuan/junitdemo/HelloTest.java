/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ph.edu.dlsu.cabatuan.junitdemo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class HelloTest {

    String message;
    List<String> greetings;

    public HelloTest() {
        greetings = new ArrayList<>();
    }

    public void setGreet(String message) {
        this.message = message;
    }

    public String getGreet() {
        return message;
    }

    public void setGreetings(List<String> greetings) {
        this.greetings = greetings;
    }

    public List<String> getGreetings() {
        return greetings;
    }

}
