package com.onekr.designmodel.command;

public class AddCommand implements Command {
	
	private Receiver receiver;
	
	public AddCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	public void execute() {
		receiver.add();
		
	}

	public void undo() {
		System.out.println("undo add");
	}
}
