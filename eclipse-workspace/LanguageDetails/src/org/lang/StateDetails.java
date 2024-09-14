package org.lang;
//child
public class StateDetails {
	private void southIndia() {
		System.out.println("xxxxxx");
		
	}
	private void northIndia() {
		System.out.println("yyyyy");
		
	}
	public static void main(String[]args) {
		LanguageInfo l = new LanguageInfo();
		l.tamilLanguage();
		l.englishLanguage();
		l.hindiLanguage();
		StateDetails s = new StateDetails();
		s.southIndia();
		s.northIndia();
	}

}
