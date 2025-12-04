package lezione10_ENUM;

public enum EstensioneFile {
	
	PDF{
		public String estensione() {return ".pdf" ;}
		public boolean supportoImg() {return true;}
	},
	WORD{
		public String estensione() {return ".docx" ;}
		public boolean supportoImg() {return true;}
	},
	GITHUB{
		public String estensione() {return ".md" ;}		
		public boolean supportoImg() {return true;}
	};

	public abstract String estensione();
	public abstract boolean supportoImg();
}
