package org.patterns;

public class Button implements Prototype {

    private Integer x, y;
    private String color;

    public Button(Integer x, Integer y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    private Button(Button button) {
        this.x = button.x;
        this.y = button.y;
        this.color = button.color;
    }

    @Override
    public Prototype clone() {
        return new Button(this);
    }

    public String getColor(){
        return this.color;
    }
}
