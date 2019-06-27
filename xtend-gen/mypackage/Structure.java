package mypackage;

import mypackage.Attribute;
import mypackage.Classifier;
import mypackage.Operation;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class Structure extends Classifier {
  private String cName;
  
  private Attribute[] attributes;
  
  private Operation[] operation;
  
  private Structure structure;
  
  @Pure
  public String getCName() {
    return this.cName;
  }
  
  public void setCName(final String cName) {
    this.cName = cName;
  }
  
  @Pure
  public Attribute[] getAttributes() {
    return this.attributes;
  }
  
  public void setAttributes(final Attribute[] attributes) {
    this.attributes = attributes;
  }
  
  @Pure
  public Operation[] getOperation() {
    return this.operation;
  }
  
  public void setOperation(final Operation[] operation) {
    this.operation = operation;
  }
  
  @Pure
  public Structure getStructure() {
    return this.structure;
  }
  
  public void setStructure(final Structure structure) {
    this.structure = structure;
  }
}
