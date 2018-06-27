package p08proxy;

import com.google.common.collect.Streams;
import lombok.val;

import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        val v1 = new Wizzard("Gandalf");
        val v2 = Wizzard.builder().name("Saruman").build();

        val tower = new BlackTower();
        val monitoredTower = new TowerProxy(tower, 3);

        Stream.of(
                "Eyryqille",
                "Kibajyll",
                "Aorihan",
                "Knashan",
                "Qahahith",
                "Wogodeis",
                "Clekely",
                "Ploro",
                "Ovris",
                "Evthal"
        )
//                .map(name -> new Wizzard(name))
//                .forEach(wizzard -> tower.enter(wizzard));
//                .filter(name -> !name.startsWith("A"))
                .map(Wizzard::new)
//                .forEach(tower::enter);
                .forEach(monitoredTower::enter);

        tower.enter(v1);
        tower.enter(v2);
    }
}
