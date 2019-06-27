package mypackage;

import mypackage.Structure;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class Relationship {
  public enum relationship {
    Aggregation,
    
    Composition,
    
    Generalization;
  }
  
  private Structure source;
  
  private Structure target;
  
  @Pure
  public Structure getSource() {
    return this.source;
  }
  
  public void setSource(final Structure source) {
    this.source = source;
  }
  
  @Pure
  public Structure getTarget() {
    return this.target;
  }
  
  public void setTarget(final Structure target) {
    this.target = target;
  }
}
