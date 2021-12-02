**Notice:** This repository is not endorsed by or affiliated with DevBoost GmbH or Software Technology Group, Dresden University of Technology.

# The Java Model Parser and Printer (JaMoPP)

JaMoPP can parse Java source code into EMF-based models and vice versa. It can be used for code analysis and refactoring.

# Getting Started

* For stand-alone usage, use the code in jamopp.standalone.JaMoPPStandalone.java (jamopp.standalone/src/jamopp/standalone/JaMoPPStandalone.java) as a starting point.

# Download / Installation

Currently, JaMoPP can be installed from its [update site](https://updatesite.palladio-simulator.com/palladio-supporting-eclipsejavadevelopmenttools/nightly/), or the plugins can be directly imported into Eclipse:

1. Use Eclipse Modeling Tools 2021-09 with Java 11 and UTF-8 encoding, and install Xtext.
2. Clone this repository.
3. Import all existing plugins of this repository.
4. In "org.emftext.language.java/workflow/", execute the "generate.mwe2" file.
5. Now, JaMoPP should be usable. Please, note: the file encoding needs to be set to UTF-8. Otherwise, there can be compilation errors.

# Sources on GitHub

[https://github.com/PalladioSimulator/Palladio-Supporting-EclipseJavaDevelopmentTools](https://github.com/PalladioSimulator/Palladio-Supporting-EclipseJavaDevelopmentTools)

Original repository: [https://github.com/DevBoost/JaMoPP](https://github.com/DevBoost/JaMoPP)
