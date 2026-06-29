package org.siba.cloud.simulation;

import org.siba.cloud.controller.SimulationController;

/**
 * -------------------------------------------------------------
 * CIF-HCS Framework
 *
 * Main Entry Point
 * -------------------------------------------------------------
 */
public class MainSimulation {

    public static void main(String[] args) {

        SimulationController controller =
                new SimulationController();

        controller.startSimulation();

    }

}