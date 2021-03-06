package com.atguigu.design.factory.absfactory.pizzastore.order;


import com.atguigu.design.factory.absfactory.pizzastore.pizza.LDPepperPizza;
import com.atguigu.design.factory.absfactory.pizzastore.pizza.Pizza;
import com.atguigu.design.factory.absfactory.pizzastore.pizza.LDCheesePizza;


public class LDFactory implements AbsFactory {

	@Override
	public Pizza createPizza(String orderType) {
		System.out.println("~使用的是抽象工厂模式~");
		Pizza pizza = null;
		if (orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;
	}

}
