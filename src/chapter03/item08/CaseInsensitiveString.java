package chapter03.item01;

public final class CaseInsensitiveString {

	public String s;

	public CaseInsensitiveString(String s){
		if(s == null){
			throw new NullPointerException();
		}
		this.s = s;
	}

	@Override 
	public boolean equals(Object o) {
		return o instanceof CaseInsensitiveString &&
				((CaseInsensitiveString) o).s.equalsIgnoreCase(s);
	}

	public static void main(String[] args){
		CaseInsensitiveString caseInsensitiveString  = new 
				CaseInsensitiveString("Polish");

		String string = "polish";

		System.out.println(caseInsensitiveString.equals(string)
				+ "    " + string.equals(caseInsensitiveString));
	}
}
