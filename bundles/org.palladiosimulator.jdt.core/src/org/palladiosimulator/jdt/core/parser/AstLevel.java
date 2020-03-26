package org.palladiosimulator.jdt.core.parser;

import org.eclipse.jdt.core.dom.AST;

public enum AstLevel {

    @Deprecated
    JLS2(AST.JLS2),
    @Deprecated
    JLS3(AST.JLS3),
    @Deprecated
    JLS4(AST.JLS4),
    @SuppressWarnings("deprecation")
    JLS8(AST.JLS8),
    @Deprecated
    JLS9(AST.JLS9),
    @Deprecated
    JLS10(AST.JLS10),
    @SuppressWarnings("deprecation")
    JLS11(AST.JLS11);
    // @Deprecated
    // JLS12(AST.JLS12),
    // JLS13(AST.JLS13);

    private final int constant;

    private AstLevel(final int i) {
        constant = i;
    }

    public int getConstant() {
        return constant;
    }

}
