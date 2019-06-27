package mypackage;

import mypackage.Classifier;
import mypackage.Parameter;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class Operation {
  private Classifier returnType;
  
  private String behName;
  
  private Parameter[] parameters;
  
  @Pure
  public Classifier getReturnType() {
    return this.returnType;
  }
  
  public void setReturnType(final Classifier returnType) {
    this.returnType = returnType;
  }
  
  @Pure
  public String getBehName() {
    return this.behName;
  }
  
  public void setBehName(final String behName) {
    this.behName = behName;
  }
  
  @Pure
  public Parameter[] getParameters() {
    return this.parameters;
  }
  
  public void setParameters(final Parameter[] parameters) {
    this.parameters = parameters;
  }
}
