package com.pcschool.ocp.d04;

public class Book {
	private int pages = 200; // 預設最高頁數

	public Book(int pages) {
		if (pages < this.pages && pages >= 0)
			this.pages = pages;
	}

	public Book() {
	}

	@Override
	public String toString() {
		return "Book [pages=" + pages + "]";
	}

}
