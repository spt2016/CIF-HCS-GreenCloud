package org.siba.cloud.scheduler;

import org.cloudsimplus.brokers.DatacenterBroker;
import org.cloudsimplus.cloudlets.Cloudlet;
import org.cloudsimplus.vms.Vm;

import java.util.List;

/**
 * -------------------------------------------------------------
 * Scheduler Interface
 *
 * Every scheduling algorithm in the framework must implement
 * this interface.
 * -------------------------------------------------------------
 */
public interface Scheduler {

    void schedule(
            DatacenterBroker broker,
            List<Vm> vmList,
            List<Cloudlet> cloudletList
    );

    String getSchedulerName();

}