package com.syntax;

public class Main {

    public static void main(String[] args) {
	SolarSystem andromeda = new SolarSystem();

	andromeda.sun = 1;
	andromeda.planet = 2;
	andromeda.moon = 4;

	FeatureSun featureSun = new FeatureSun();
	featureSun.color = "Red";
	featureSun.heat = "whatever#2";
	featureSun.radius = "545678654545km";
	featureSun.temp = "billions#2";
	
	Planet1 planet1 = new Planet1();

	planet1.color = "Green";
	planet1.size = 99999;
	planet1.anotherAttribute = "another attribute value";

	Planet2 planet2 = new Planet2();
	planet2.color = "Orange";
	planet2.size = "Oversize";
	planet2.status = "Some status";



    }
}
