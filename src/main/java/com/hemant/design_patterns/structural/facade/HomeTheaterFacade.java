package com.hemant.design_patterns.structural.facade;

// Facade class
public class HomeTheaterFacade {
    private final Television tv;
    private final SoundSystem soundSystem;
    private final DVDPlayer dvdPlayer;
    private final CableBox cableBox;

    //default constructor to initialise all sub-system
    public HomeTheaterFacade() {
        tv = new Television();
        soundSystem = new SoundSystem();
        dvdPlayer = new DVDPlayer();
        cableBox = new CableBox();
    }

    public void watchMovie() {
        System.out.println("Starting to watch a movie");
        tv.turnOn();
        soundSystem.turnOn();
        soundSystem.setVolume(50);
        dvdPlayer.turnOn();
        dvdPlayer.play();
    }

    public void watchTV(int channel) {
        System.out.println("Starting to watch TV");
        tv.turnOn();
        soundSystem.turnOn();
        soundSystem.setVolume(30);
        cableBox.turnOn();
        cableBox.changeChannel(channel);
    }

    public void turnOff() {
        System.out.println("Turning off the home theater system");
        tv.turnOff();
        soundSystem.turnOff();
        dvdPlayer.turnOff();
        cableBox.turnOff();
    }
}
