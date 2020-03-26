package org.palladiosimulator.jdt.core.parser;

import java.net.URI;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.palladiosimulator.jdt.helper.FileHelper;

public class AstParser {

    private static final String JAVA_FILE_EXTENSION = "java";

    private static final Logger LOG = Logger.getLogger(AstParser.class);

    private static final String[] STANDRAD_ENCODINGS = new String[] { "utf-8" };

    private final AstLevel level;

    private final ASTParser parser;

    private final AstRequestor requestor;

    public AstParser(final AstLevel level) {
        this.level = level;
        requestor = new AstRequestor();
        parser = ASTParser.newParser(level.getConstant());
        parser.setKind(ASTParser.K_COMPILATION_UNIT);
        parser.setResolveBindings(true);
        parser.setStatementsRecovery(true);
        // parser.setCompilerOptions(options); TODO Set the options for the given level
        LOG.info("Instantiation of a new parser for Java " + level.getConstant());
    }

    public boolean createAsts(final URI sourcePath) {
        try {
            final String[] sourceFilePaths = FileHelper.getRegularFiles(sourcePath, JAVA_FILE_EXTENSION);
            parser.setEnvironment(null, new String[] { FileHelper.createPath(sourcePath).toString() },
                    STANDRAD_ENCODINGS, true);
            // TODO Determine the encoding of all files
            parser.createASTs(sourceFilePaths, new String[sourceFilePaths.length], new String[0], requestor, null);

        } catch (final IllegalArgumentException e) {
            LOG.error("No files could be parsed for the specified path: " + String.valueOf(sourcePath), e);
            return false;
        }

        return true;
    }

    public Map<String, CompilationUnit> getCompilationUnits() {
        return requestor.getCompilationUnits();
    }

    public AstLevel getLevel() {
        return level;
    }

}
