package spring.basic.inject;

public class TextEditor {

	private SpellChecker spellChecker1;

	// a setter method to inject the dependency.
	public void setSpellChecker(SpellChecker spellChecker1) {
		// System.out.println("Inside setSpellChecker." );
		this.spellChecker1 = spellChecker1;
	}

	// a getter method to return spellChecker
	public SpellChecker getSpellChecker() {
		return spellChecker1;
	}

	public void spellCheck() {
		spellChecker1.checkSpelling();
	}
}