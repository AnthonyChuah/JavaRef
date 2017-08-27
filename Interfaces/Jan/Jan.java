class Jan extends Parent implements Teacher {
    @Override
    public void scold() {
	super.scold();
	System.out.println("Jan::scold");
    }
    public static void main(String[] args) {
	System.out.println("Jan::main");
	Jan j = new Jan();
	j.scold();
    }
}
