package org.palladiosimulator.jdt.helper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.log4j.Logger;

public final class FileHelper {

    private static final String EMPTY_STRING = "";

    private static final String LINE_SEPARATOR = System.lineSeparator();

    private static final Logger LOG = Logger.getLogger(FileHelper.class);

    /**
     * The maximum number of directory levels to search
     */
    public static final int MAX_DEPTH = Integer.MAX_VALUE;

    private static final BinaryOperator<String> STRING_ACCUMULATOR = (s1, s2) -> s1 + LINE_SEPARATOR + s2;

    public static File createFile(final String path) {
        return new File(createUri(path));
    }

    public static File createFile(final URI uri) {
        return new File(uri);
    }

    public static Path createPath(final String path) {
        return Paths.get(path);
    }

    public static Path createPath(final URI uri) {
        return Paths.get(uri);
    }

    public static URI createUri(final Path path) {
        return path.toUri();
    }

    public static URI createUri(final String path) {
        return Paths.get(path).toUri();
    }

    public static Stream<Path> findRegularFiles(final URI path) {
        try {
            return Files.find(Paths.get(path), MAX_DEPTH, (filePath, fileAttributes) -> fileAttributes.isRegularFile())
                    .sorted();
        } catch (final IOException e) {
            LOG.error(e.getMessage(), e);
            return Stream.empty();
        }
    }

    public static Stream<Path> findRegularFiles(final URI path, final String extension) {
        return findRegularFiles(path)
                .filter(filePath -> filePath.getFileName().toString().toLowerCase().endsWith(extension.toLowerCase()));
    }

    public static String getFileName(final Path path) {
        return path.getFileName().toString();
    }

    public static String getFileName(final String path) {
        return getFileName(createPath(path));
    }

    public static String getFileName(final URI uri) {
        return getFileName(createPath(uri));
    }

    public static String[] getRegularFiles(final URI path) {
        return findRegularFiles(path).map(String::valueOf).toArray(String[]::new);
    }

    public static String[] getRegularFiles(final URI path, final String extension) {
        return findRegularFiles(path, extension).map(String::valueOf).toArray(String[]::new);
    }

    public static String readFile(final Path path) {
        return readFile(path.toUri());
    }

    public static String readFile(final URI path) {
        try (final BufferedReader reader = new BufferedReader(new FileReader(createFile(path)))) {
            return reader.lines().reduce(EMPTY_STRING, STRING_ACCUMULATOR);
        } catch (final IOException e) {
            LOG.error(e.getMessage(), e);
            return EMPTY_STRING;
        }
    }

    public static String readFiles(final URI path, final String extension) {
        return findRegularFiles(path, extension).map(FileHelper::readFile).reduce(EMPTY_STRING, STRING_ACCUMULATOR);
    }

    public static Map<Path, String> readFiles2(final URI path, final String extension) {
        return findRegularFiles(path, extension).collect(Collectors.toMap(Function.identity(), FileHelper::readFile));
    }

    private FileHelper() {
        assert false : "Helper class should not be instantiated";
    }

}
