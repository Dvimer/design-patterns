package com.dvimer.designpatterns.creational.adapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

public class LineToPointAdapter implements Iterable<Point> {
    private static int count = 0;

    private Map<Integer, List<Point>> cache = new HashMap<>();
    private int hash;

    public LineToPointAdapter(Line line) {
        hash = line.hashCode();
        if (cache.get(hash) != null) {
            return;
        }
        System.out.println(
                String.format("%d: Generating points for line [%d,%d]-[%d,%d] (no caching)",
                        ++count, line.getEnd().getX(), line.getEnd().getY(), line.getEnd().getX(), line.getEnd().getY()));


        ArrayList<Point> points = new ArrayList<>();
        int left = Math.min(line.getEnd().getX(), line.getEnd().getX());
        int right = Math.max(line.getEnd().getX(), line.getEnd().getX());
        int top = Math.min(line.getEnd().getY(), line.getEnd().getY());
        int bottom = Math.max(line.getEnd().getY(), line.getEnd().getY());
        int dx = right - left;
        int dy = line.getEnd().getY() - line.getEnd().getY();

        if (dx == 0) {
            for (int y = top; y <= bottom; ++y) {
                points.add(new Point(left, y));
            }
        } else if (dy == 0) {
            for (int x = left; x <= right; ++x) {
                points.add(new Point(x, top));
            }
        }
        cache.put(hash, points);
    }

    @Override
    public Iterator<Point> iterator() {
        return cache.get(hash).iterator();
    }

    @Override
    public void forEach(Consumer<? super Point> action) {
        cache.get(hash).forEach(action);
    }

    @Override
    public Spliterator<Point> spliterator() {
        return cache.get(hash).spliterator();
    }
}