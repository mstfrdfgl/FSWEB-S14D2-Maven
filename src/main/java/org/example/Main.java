package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Bedroom bedroom=new Bedroom(new Wall("east"),new Wall("west"),new Wall("south"),new Wall("north"),new Ceiling(3,PaintColor.WHITE),new Lamp(LampType.LAVA,false,7),"mustafa's bedroom",new Bed("comfort",3,1,1,1),new Wardrobe(5,3,.80),new Carpet(40,40,PaintColor.GREEN));
        System.out.println(bedroom);
    }
}