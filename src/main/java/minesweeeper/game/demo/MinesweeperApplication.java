package minesweeeper.game.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MinesweeperApplication {

    public static void main(String[] args) {

        SpringApplication.run(MinesweeperApplication.class, args);
        System.out.println("Enter the Difficulty Level\nPress 0 for BEGINNER (9 * 9 Cells and 10 Mines)\nPress 1 for INTERMEDIATE (16 * 16 Cells and 40 Mines)\nPress 2 for ADVANCED (24 * 24 Cells and 99 Mines)");
    }

}
