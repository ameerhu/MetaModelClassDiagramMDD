package mypackage;

import mypackage.Classifier;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class Attribute {
  private Classifier type;
  
  private String name;
  
  @Pure
  public Classifier getType() {
    return this.type;
  }
  
  public void setType(final Classifier type) {
    this.type = type;
  }
  
  @Pure
  public String getName() {
    return this.name;
  }
  
  public void setName(final String name) {
    this.name = name;
  }
}
