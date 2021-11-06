package com.syntax;

public class Main {

    public static void main(String[] args) {
	SolarSystem andromeda = new SolarSystem();

	andromeda.sun = 1;
	andromeda.planet = 2;
	andromeda.moon = 4;

	FeatureSun featureSun = new FeatureSun();
	featureSun.color = "yellow";
	featureSun.heat = "whatever";
	featureSun.radius = "545678654545";
	featureSun.temp = "billions";


    }
}
