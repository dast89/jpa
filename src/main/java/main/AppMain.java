package main;


import Entity.PlayerEntity;
import crud.CarService;

import java.util.List;


public class AppMain {
    static CarService service = new CarService();
    public static void main(String[] args) {
        System.out.println("Hibernate tutorial");
        PlayerEntity playerEntity = new PlayerEntity();
        List<PlayerEntity> PlayerEntities = service.getAll();

        //Выводим полученый список авто
        for(PlayerEntity c : PlayerEntities){
            System.out.println(c);
        }
    }
}
