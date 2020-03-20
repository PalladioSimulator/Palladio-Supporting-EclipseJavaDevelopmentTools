package org.palladiosimulator.jdt.core.parser;

import org.apache.log4j.Logger;
import org.eclipse.jdt.core.dom.ASTParser;
import org.palladiosimulator.jdt.core.node.AbstractSyntaxTree;
import org.palladiosimulator.jdt.core.visitor.AstVisitor;

public class AstParser {

    private static final Logger LOG = Logger.getLogger(AstParser.class);

    private final Level level;
    private final ASTParser parser;
    private Kind kind;
    private String source;

    public AstParser(Level level) {
        this.level = level;
        parser = ASTParser.newParser(level.getConstant());
        parser.setResolveBindings(true);
        parser.setStatementsRecovery(true);
        LOG.info("Instantiation of a new parser for Java " + level.getConstant());
    }

    public AstParser(Level level, Kind kind) {
        this(level);
        setKind(kind);
    }

    public AstParser(Level level, Kind kind, String source) {
        this(level, kind);
        setSource(source);
    }

    public AstParser(Level level, String source) {
        this(level);
        setSource(source);
    }

    public AbstractSyntaxTree createAst() {
        return new AbstractSyntaxTree(parser.createAST(new LoggerProgressMonitor()));
    }

    public AbstractSyntaxTree createAst(AstVisitor<?> visitor) {
        final AbstractSyntaxTree ast = createAst();
        ast.accept(visitor);
        return ast;
    }

    public Kind getKind() {
        return kind;
    }

    public Level getLevel() {
        return level;
    }

    public String getSource() {
        return source;
    }

    public void setKind(Kind kind) {
        this.kind = kind;
        parser.setKind(kind.getConstant());
    }

    public void setSource(String source) {
        this.source = source;
        parser.setSource(source.toCharArray());
    }

}
