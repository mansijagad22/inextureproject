package com.example.entity;

public class TextEditor {

	private SpellChecker spellChecker;
	
	// a setter method to inject the dependency.
	public void setSpellChecker(SpellChecker sc) {
		this.spellChecker = sc;
		System.out.println("Texteditor method and Inside setSpellChecker." );
		sc.setNum(1);
		sc.setName("text-editor-set-method");
		System.out.println("Values set for spell checker in text editor id "+ spellChecker.getNum() + "and name is "+ spellChecker.getName() );
	}
	 // a getter method to return spellChecker
	public SpellChecker getSpellChecker() {
		System.out.println("Texteditor method and Inside getSpellChecker." );
		spellChecker.getNum();
		spellChecker.getName();
		return spellChecker;
	}
	public void spellChecker() {
		spellChecker.checkSpelling();
	}
}
