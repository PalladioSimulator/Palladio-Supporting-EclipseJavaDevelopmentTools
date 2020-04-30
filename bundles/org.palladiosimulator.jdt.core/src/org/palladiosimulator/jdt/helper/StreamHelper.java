package org.palladiosimulator.jdt.helper;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class StreamHelper {

    public static <T> Collector<T, ?, List<T>> toSortedDistinctUnmodifiableList() {
        return Collector.of((Supplier<List<T>>) LinkedList::new, List::add, (left, right) -> {
            left.addAll(right);
            return left;
        }, list -> list.stream().distinct().sorted().collect(Collectors.toUnmodifiableList()));
    }

    public static <E> Stream<? extends E> getSubclasses(Collection<E> collection, final Class<? extends E> clazz) {
        return collection.stream().filter(clazz::isInstance).map(clazz::cast);
    }

    private StreamHelper() {
        assert false : "Helper class should not be instantiated";
    }

}
