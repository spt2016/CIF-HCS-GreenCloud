package org.siba.cloud.controller;

import org.cloudsimplus.core.CloudSimPlus;
import org.siba.cloud.infrastructure.InfrastructureManager;

/**
 * ---------------------------------------------------------
 * SimulationController
 *
 * Controls the complete execution of the Cloud Simulation.
 * ---------------------------------------------------------
 */
public class SimulationController {

    private final CloudSimPlus simulation;

    public SimulationController() {
        simulation = new CloudSimPlus();
    }

    public void startSimulation() {

        System.out.println("\n========================================");
        System.out.println("CIF-HCS Framework");
        System.out.println("Green Cloud Computing Simulation");
        System.out.println("========================================");

        InfrastructureManager infrastructure =
                new InfrastructureManager(simulation);

        infrastructure.initialize();

        System.out.println("\nStarting CloudSim Simulation...");

        simulation.start();

        System.out.println("\nSimulation Completed Successfully.");

    }

}