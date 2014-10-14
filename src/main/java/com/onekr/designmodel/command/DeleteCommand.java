package com.onekr.designmodel.command;

public class DeleteCommand implements Command {

	private Receiver receiver;
	
	public DeleteCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	public void execute() {
		receiver.delete();
		
	}

	public void undo() {
		System.out.println("undo delete");
	}
}
