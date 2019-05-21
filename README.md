# OPENRNDR Gradle template

A bare-bones template for writing [OPENRNDR](http://openrndr.org) programs. Contains Gradle project files and a minimal program example.

## Intellij IDE

* Click the `run` widget next to `main()` in the left margin/gutter of the source file. 

## Gradle tasks

 * `run` runs the template program (with the correct JVM arguments)
 * `jar` creates an überjar that contains the program and all its dependencies

## Executable Jar

Command line instructions line for this example:

* For TemplateProgram.kt
```
java -jar myjar.jar
 
 OR
 
java -cp myjar.jar TemplateProgramKt
```

## On MacOS
add `-XstartOnFirstThread` to JVM arguments (at Run/Edit Configurations/VM Options if you're using IntelliJ Idea)

