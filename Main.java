package Packages.Inferface;

public class Main implements Engine,Brake,MusicPlayer{
    @Override
    public void start() {
     
        System.out.println("I can Start");
    }

    @Override
    public void stop() {
      
        System.out.println("I am engine Stop");
    }
     @Override
    public void acc() {

        System.out.println("I can Accerlerate");
       
    }


    @Override
    public void brake() {
    System.out.println("I can brake");
        
    }

}

   
    

    

