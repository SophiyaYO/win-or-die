package minesweeeper.game.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String getIntro() {
        return "Enter the Difficulty Level</br>Press 0 for BEGINNER (9 * 9 Cells and 10 Mines)</br>Press 1 for INTERMEDIATE (16 * 16 Cells and 40 Mines)</br> Press 2 for ADVANCED (24 * 24 Cells and 99 Mines)";
    }
}
