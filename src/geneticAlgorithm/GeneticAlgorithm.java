package geneticAlgorithm;

import GenBody.Planet;
import GenBody.Planets;
import GenBody.Simulation;
import GenBody.Vector;
import interfaces.Vector3dInterface;

import java.util.List;

public class GeneticAlgorithm {
    private List<Planet> planetsList;
    private Vector3dInterface[] positionOfSpacechip;
    private static Vector titanFinalPosition = new Vector(8.790206157956954E11, -1.2037722320318977E12, -1.4411708984699354E10);
    final static int popSize = 40;
    final static int cycles = 1000;
    private MiniSimulation sim;




    public static void main(String[] args) {
        Population pop = new Population(popSize);
        MiniSimulation sim = new MiniSimulation();
        pop.setTargetPosition(titanFinalPosition);

        for(int i = 0; i < cycles; i++)
        {
            pop.calculateFitnessOfPopulation();
            System.out.println(pop.getBestIndividual().getVelocity());
            System.out.println(pop.getBestIndividual().getFitness());
            Individual[] nextGen = pop.getNewGeneration(pop.getIndividuals());
            pop.setIndividuals(nextGen);
        }
    }


 /*   public GeneticAlgorithm()
    {
        Planets planets = new Planets();
        this.planetsList=planets.getPlanets();
        positionOfSpacechip = sim.trajectory(  new Vector(6371e3,0,0), new Vector(0.5896979523584819, -0.8075660030972522, -0.0096682793579059),31556926, 1000);
    } */

}
