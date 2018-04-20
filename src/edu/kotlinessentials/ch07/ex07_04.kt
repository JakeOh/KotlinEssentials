package edu.kotlinessentials.ch07

fun main(args: Array<String>) {
    println("Ex-7-04 Visibility Modifier")

}

// Visibility Modifiers: private, protected, internal, public
// The default visibility, used if there is no explicit modifier, is public.
//
// Functions, properties and classes, objects and interfaces can be declared on the "top-level", i.e. directly inside a package:
// - If you do not specify any visibility modifier, public is used by default, which means that your declarations will be visible everywhere;
// - If you mark a declaration private, it will only be visible inside the file containing the declaration;
// - If you mark it internal, it is visible everywhere in the same module;
// - protected is not available for top-level declarations.
// Note: to use a visible top-level declaration from another package, you should still import it.
//
// For members declared inside a class:
// - private: visible inside this class only (including all its members)
// - protected: same as private + visible in subclasses too
// - internal: any client inside this module who sees the declaring class sees its internal members
// - public: any client who sees the declaring class sees its public members
//
