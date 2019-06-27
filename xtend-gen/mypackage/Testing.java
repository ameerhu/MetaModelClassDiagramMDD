package mypackage;

public class Testing {
	public static void main(String []args) {
		Structure ClassA = new Structure();
		ClassA.setCName("ClassA");
		
		Attribute attr1 = new Attribute();
		attr1.setName("name");
		Classifier c1 = new Classifier();
		c1.setName("String");
		attr1.setType(c1);
		
		Attribute attr2 = new Attribute();
		attr2.setName("width");
		Classifier c2 = new Classifier();
		c2.setName("Integer");
		attr2.setType(c2);
		
		Attribute attr3 = new Attribute();
		attr3.setName("height");
		Classifier c3 = new Classifier();
		c3.setName("Integer");
		attr3.setType(c3);
		
		ClassA.setAttributes(new Attribute[] {attr1,attr2,attr3});
		
		Structure Rectangle = new Structure();
		Rectangle.setCName("Rectangle");
		
		Attribute attr4 = new Attribute();
		attr4.setName("shape");
		Classifier c4 = new Classifier();
		c4.setName("Rectangle");
		attr4.setType(c4);
		
	}
}
