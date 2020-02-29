package com.class29;

public abstract class File{

	public void edit() {
		System.out.println("Edit file");
	}
	public void close() {
		System.out.println("Close file");
	}
	public abstract void open();	
}
class JavaFile extends File {

	@Override
	public void open() {
		System.out.println("To open .java file we need notepad++ or sublime text");
	}	
}
class WordFile extends File {

	@Override
	public void open() {
		System.out.println("To open .doc file we need Wicrosoft word to be installed");
	}	
}
class PDFFile extends File {

	@Override
	public void open() {
		System.out.println("To open .pdf file we need Microsoft Oficce to be installed");
	}	
}






