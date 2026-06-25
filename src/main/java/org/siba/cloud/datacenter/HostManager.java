package org.siba.cloud.datacenter;

import org.cloudsimplus.hosts.Host;
import org.cloudsimplus.hosts.HostSimple;
import org.cloudsimplus.resources.Pe;
import org.cloudsimplus.resources.PeSimple;

import java.util.ArrayList;
import java.util.List;

public class HostManager {

    public List<Host> createHosts() {

        System.out.println("--------------------------------");
        System.out.println("Creating Physical Hosts");
        System.out.println("--------------------------------");

        List<Host> hostList = new ArrayList<>();

        // Create CPU cores (Processing Elements)
        List<Pe> peList = new ArrayList<>();

        for(int i=0;i<8;i++){
            peList.add(new PeSimple(1000));
        }

        Host host = new HostSimple(
                16384,      // RAM (MB)
                100000,     // Bandwidth (Mbps)
                1000000,    // Storage (MB)
                peList
        );

        hostList.add(host);

        System.out.println("Host Created Successfully.");

        return hostList;
    }
}