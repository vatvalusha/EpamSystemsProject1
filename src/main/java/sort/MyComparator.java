package sort;

import carriage.Convenience;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/**
 * Created by vatva on 14.02.2017.
 */
public class MyComparator implements Comparator<Convenience> {
    public int compare(Convenience o1, Convenience o2) {
        return Integer.compare(o1.getPrior(),o2.getPrior());
    }

    public Comparator<Convenience> reversed() {
        return null;
    }

    public Comparator<Convenience> thenComparing(Comparator<? super Convenience> other) {
        return null;
    }

    public <U> Comparator<Convenience> thenComparing(Function<? super Convenience, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return null;
    }

    public <U extends Comparable<? super U>> Comparator<Convenience> thenComparing(Function<? super Convenience, ? extends U> keyExtractor) {
        return null;
    }

    public Comparator<Convenience> thenComparingInt(ToIntFunction<? super Convenience> keyExtractor) {
        return null;
    }

    public Comparator<Convenience> thenComparingLong(ToLongFunction<? super Convenience> keyExtractor) {
        return null;
    }

    public Comparator<Convenience> thenComparingDouble(ToDoubleFunction<? super Convenience> keyExtractor) {
        return null;
    }
}
