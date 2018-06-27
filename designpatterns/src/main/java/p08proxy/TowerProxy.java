package p08proxy;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TowerProxy implements WizzardTower {

    private final WizzardTower tower;
    private final Integer capacity;
    private Integer wizzardCount = 0;

    @Override
    public void enter(Wizzard wizzard) {
        if (wizzard.getName().toUpperCase().startsWith("E")) {
            System.out.println(String.format("Sorry, \"%s\" is not allowed", wizzard.getName()));
            return;
        }
        if(wizzardCount >= capacity){
            System.out.println(String.format("Sorry, \"%s\" black tower is full", wizzard.getName()));
            return;
        }
        wizzardCount += 1;
        tower.enter(wizzard);
    }
}