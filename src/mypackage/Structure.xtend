package mypackage

import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class Structure extends Classifier{
	String cName
	Attribute[] attributes
	Operation[] operation
	Structure structure
}