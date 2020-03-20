package org.palladiosimulator.jdt.core.parser;

import org.eclipse.jdt.core.dom.ASTParser;

public enum Kind {

    EXPRESSION(ASTParser.K_EXPRESSION),
    STATEMENTS(ASTParser.K_STATEMENTS),
    CLASS_BODY_DECLARATIONS(ASTParser.K_CLASS_BODY_DECLARATIONS),
    COMPILATION_UNIT(ASTParser.K_COMPILATION_UNIT);

    private final int constant;

    private Kind(int i) {
        constant = i;
    }

    public int getConstant() {
        return constant;
    }

}
