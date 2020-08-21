package com.pcschool.ocp.d10.case2;

public class Note {
	private Note previousNote;
	private int data;
	private Note nextNote;

	public Note(int data) {
		this(null, data, null);
	}

	public Note(Note previousNote, int data) {
		this(previousNote, data, null);
	}

	public Note(int data, Note nextNote) {
		this(null, data, nextNote);
	}

	public Note(Note previousNote, int data, Note nextNote) {
		this.previousNote = previousNote;
		this.data = data;
		this.nextNote = nextNote;
	}

	public Note getPreviousNote() {
		return previousNote;
	}

	public void setPreviousNote(Note previousNote) {
		this.previousNote = previousNote;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Note getNextNote() {
		return nextNote;
	}

	public void setNextNote(Note nextNote) {
		this.nextNote = nextNote;
	}

	public String getNextNotes() {
		StringBuilder sb = new StringBuilder(data + ", ");
		Note next = nextNote;
		while (next != null) {
			sb.append(next.data).append(", ");
			next = next.getNextNote();
		}
		return sb.delete(sb.length() - 2, sb.length()).toString();
	}

	public String getPreviousNotes() {
		StringBuilder sb = new StringBuilder(data + ", ");
		Note previous = previousNote;
		while (previous != null) {
			sb.append(previous.data).append(", ");
			previous = previous.getPreviousNote();
		}
		return sb.delete(sb.length() - 2, sb.length()).toString();
	}

}
