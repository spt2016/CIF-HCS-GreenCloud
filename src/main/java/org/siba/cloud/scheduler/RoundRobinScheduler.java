package org.siba.cloud.scheduler;

import org.cloudsimplus.brokers.DatacenterBroker;
import org.cloudsimplus.cloudlets.Cloudlet;
import org.cloudsimplus.vms.Vm;

import java.util.List;

/**
 * -------------------------------------------------------------
 * Round Robin Scheduler
 * Baseline scheduling algorithm.
 * -------------------------------------------------------------
 */
public class RoundRobinScheduler implements Scheduler {

    @Override
    public void schedule(
            DatacenterBroker broker,
            List<Vm> vmList,
            List<Cloudlet> cloudletList) {

        broker.submitVmList(vmList);
        broker.submitCloudletList(cloudletList);

        System.out.println("\nRound Robin Scheduler Selected.");

    }

    @Override
    public String getSchedulerName() {
        return "Round Robin";
    }

}