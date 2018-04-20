package edu.kotlinessentials.ch07

fun main(args: Array<String>) {
    println("Ex-7-04 Visibility Modifier")

}

// Visibility Modifiers: private, protected, internal, public
// The default visibility, used if there is no explicit modifier, is public.
//
// For members declared inside a class:
// - private: visible inside this class only (including all its members)
// - protected: same as private + visible in subclasses too
// - internal: any client inside this module who sees the declaring class sees its internal members
// - public: any client who sees the declaring class sees its public members

