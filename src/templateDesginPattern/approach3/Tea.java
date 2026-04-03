package templateDesginPattern.approach3;

import templateDesginPattern.approach3.CaffeineBeverage;

public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
