package org.siba.cloud.simulation;

import org.siba.cloud.controller.SimulationController;

/**
 * -------------------------------------------------------------
 * Carbon-Intensity Forecast-Driven Hybrid Cuckoo Search Framework
 *
 * Main Entry Point
 *
 * Version : 2.0
 * -------------------------------------------------------------
 */
public class MainSimulation {

    public static void main(String[] args) {

        SimulationController controller =
                new SimulationController();

        controller.startSimulation();

    }

}