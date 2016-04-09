package org.sourceit.entities;

/**
 * Just box.
 */
public class Box {

    private int width;
    private int height;
    private int length;

    public Box() {
        this(1, 1, 1);
    }

    public Box(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    // boxes are equals if volume is the same.
    @Override
    public boolean equals(Object o) {
        return true;
    }

    // ???. Just look at comment above and think.
    // I hope that you read what I asked.
    @Override
    public int hashCode() {
        return 0;
    }
}
