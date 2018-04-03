package com.sung;



class Movie {
    private String name;

    public Movie(String name){
        this.name = name;
    }
    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("'Jaws'");
    }

    public String plot(){
        return "A shark eats lots of people";
    }
}

class IndependencyDay extends Movie{
    public IndependencyDay(){
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Alients attempt to take over planet earth";
    }
}


class MazeRunner extends Movie{
    public MazeRunner(){
        super("MazeRunner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}

class StarWars extends Movie{
    public StarWars(){
        super("StarWars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe";
    }
}

class Forgetable extends Movie{
    public Forgetable(){
        super("Forgetabble");
    }
    //no plot method
}




public class Main {

    public static void main(String[] args) {
	// write your code here
    for(int i =0; i<11; i++){
        Movie movie = randomMovie();
        System.out.println("Movie # " + i + ": " + movie.getName());
        System.out.println("Movie plot is " + movie.plot());
    }

    }

    public static Movie randomMovie(){
       int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number genereated was " + randomNumber);
        switch(randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependencyDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
            default:
                return null;
        }


    }

}
