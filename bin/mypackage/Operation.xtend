package mypackage

import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class Operation {
	Classifier returnType
	String behName
	Parameter[] parameters
}