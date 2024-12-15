package com.tools.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiClass {
    @GetMapping("getSum")
    public String sum(@RequestParam("no1") Integer no1,
                      @RequestParam("no2") Integer no2) {
        Integer sum = no1 + no2;
        return "The sum of numbers is " + sum;
    }

    @GetMapping("getDiff")
    public String diff(@RequestParam("no1") Integer no1,
                       @RequestParam("no2") Integer no2){
        Integer diff = no1 - no2;
        return "The diff is" + diff;
    }

    @GetMapping("getProduct")
    public String product(@RequestParam("no1") Integer no1,
                          @RequestParam("no2") Integer no2){
        Integer product = no1*no2;
        return "The product is " + product;
    }

    @GetMapping("getDiv")
    public String div(@RequestParam("no1") Integer no1,
                      @RequestParam("no2") Integer no2){
        Integer div = no1 % no2;
        return "The div is "+ div;
    }




}
