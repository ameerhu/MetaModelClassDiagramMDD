package mypackage

import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class Relationship {
	enum relationship{Aggregation,Composition,Generalization}
	Structure source
	Structure target
}