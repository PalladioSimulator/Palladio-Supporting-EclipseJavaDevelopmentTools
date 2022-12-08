# The Extended Java Model Parser and Printer (JaMoPP)

JaMoPP can parse Java source code into EMF-based models and vice versa. It can be used for code analysis and refactoring.

Compared to the original version, the following extensions were made:

- Support for Java 7-15
- Parsing based on the Eclipse Java Development Tools (JDT)
- Printing directly based on the meta model
- Three variants for the reference resolution (based on the Java syntax and/or JDT bindings)
- Trivial recovery for unresolved references

The current documentation of the extended JaMoPP is available [online at the KIT library](https://publikationen.bibliothek.kit.edu/1000149186).

The extended version is developed by the Institute of Information Security and Dependability (KASTEL) at the Karlsruher Institute of Technology (KIT). This repository is not endorsed by or affiliated with DevBoost GmbH or Software Technology Group, Dresden University of Technology.

# Download / Installation

Currently, JaMoPP can be installed from its [update site](https://updatesite.palladio-simulator.com/palladio-supporting-eclipsejavadevelopmenttools/nightly/), or the plugins can be directly imported into Eclipse:

1. Use the Eclipse Modeling Tools 2022-09 with Java 11 and UTF-8 encoding, and (optionally) install Xtext from the Marketplace.
2. Clone this repository.
3. Import all existing plugins of this repository.
4. In `releng/org.palladiosimulator.jdt.workflow/workflow/`, execute the `generate.mwe2` file (if Xtext is installed). Alternatively, execute a build in which the model code is also generated.
5. Now, JaMoPP should be usable. Please, note: the file encoding needs to be set to UTF-8. Otherwise, there can be compilation errors.

# Building

To build JaMoPP, execute `mvnw clean verify` within the repository to start the Maven build via its wrapper.

# Sources on GitHub

[https://github.com/PalladioSimulator/Palladio-Supporting-EclipseJavaDevelopmentTools](https://github.com/PalladioSimulator/Palladio-Supporting-EclipseJavaDevelopmentTools)

Original repository: [https://github.com/DevBoost/JaMoPP](https://github.com/DevBoost/JaMoPP)
