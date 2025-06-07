/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

/**
 *
 * @author vladshuvaev
 */
public class Result {

    private String name;
    private int points;

    public Result(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public String getName() {
        return this.name;
    }

    public int getPoints() {
        return this.points;
    }

}
