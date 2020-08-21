package com.pcschool.ocp.d10.case1;

public class Note {
	private int data;
	private Note nextNote;

	public Note(int data) {
		this(data, null);
	}
	
	public Note(int data, Note nextNote) {
		this.data = data;
		this.nextNote = nextNote;
	}
	
	public int getData() {
		return data;
	}

	public Note getNextNote() {
		return nextNote;
	}

	@Override
	public String toString() {
		return "Note [data=" + data + ", nextNote=" + nextNote + "]";
	}

}
