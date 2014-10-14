package com.onekr.designmodel.visitor;

import java.util.Iterator;
import java.util.List;

public class Visitor implements PersonVisitor {

	@Override
	public void visitor(Leg leg) {
		System.out.println("leg is visited");
	}

	@Override
	public void visitor(Hand hand) {
		System.out.println(hand.getHand() + "is visited");
	}

	public void visitorCollections(List cons) {
		Iterator it = cons.iterator();
		while (it.hasNext()) {
			Visable o = (Visable) it.next();
			o.accept(this);
		}
	}

}