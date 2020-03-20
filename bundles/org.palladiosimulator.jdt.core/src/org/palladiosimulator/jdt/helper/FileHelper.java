package org.palladiosimulator.jdt.helper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

import org.apache.log4j.Logger;

public class FileHelper {

    private static final Logger LOG = Logger.getLogger(FileHelper.class);

    private static final String EMPTY_STRING = "";

    /**
     * The maximum number of directory levels to search
     */
    public static final int MAX_DEPTH = Integer.MAX_VALUE;

    private static final String LINE_SEPARATOR = System.lineSeparator();

    private static final BinaryOperator<String> STRING_ACCUMULATOR = (s1, s2) -> s1 + LINE_SEPARATOR + s2;

    public static File createFile(String path) {
        return new File(createUri(path));
    }

    public static File createFile(URI uri) {
        return new File(uri);
    }

    public static URI createUri(Path path) {
        return path.toUri();
    }

    public static URI createUri(String path) {
        return Paths.get(path).toUri();
    }

    public static Stream<Path> findRegularFiles(URI path) {
        try {
            return Files.find(Paths.get(path), MAX_DEPTH, (filePath, fileAttributes) -> fileAttributes.isRegularFile())
                    .sorted();
        } catch (final IOException e) {
            LOG.error(e.getMessage(), e);
            return Stream.empty();
        }
    }

    public static Stream<Path> findRegularFiles(URI path, String extension) {
        return findRegularFiles(path)
                .filter(filePath -> filePath.getFileName().toString().toLowerCase().endsWith(extension.toLowerCase()));
    }

    public static String readFile(Path path) {
        return readFile(path.toUri());
    }

    public static String readFile(URI path) {
        try (final BufferedReader reader = new BufferedReader(new FileReader(createFile(path)))) {
            return reader.lines().reduce(EMPTY_STRING, STRING_ACCUMULATOR);
        } catch (final IOException e) {
            LOG.error(e.getMessage(), e);
            return EMPTY_STRING;
        }
    }

    public static String readFiles(URI path, String extension) {
        return findRegularFiles(path, extension).map(FileHelper::readFile).reduce(EMPTY_STRING, STRING_ACCUMULATOR);
    }

    private FileHelper() {
        assert false : "Helper class should not be instantiated";
    }

}
