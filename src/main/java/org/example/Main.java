package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Bedroom bedroom = new Bedroom("mustafa's bedroom",new Wall("east"),new Wall("west"),new Wall("north"),new Wall("south"),new Ceiling(3, PaintColor.WHITE),new Bed("comfort",3,1,1,1),new Lamp(LampType.LAVA,false,7),new Wardrobe(5,5,60.00),new Carpet(30,30,PaintColor.GREEN));
        System.out.println(bedroom);
    }
}