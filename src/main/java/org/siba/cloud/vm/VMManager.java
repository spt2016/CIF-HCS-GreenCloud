package org.siba.cloud.vm;

import org.cloudsimplus.vms.Vm;
import org.cloudsimplus.vms.VmSimple;
import org.siba.cloud.config.CloudConfiguration;

import java.util.ArrayList;
import java.util.List;

public class VMManager {

    public List<Vm> createVMs() {

        System.out.println("--------------------------------");
        System.out.println("Creating Virtual Machines");
        System.out.println("--------------------------------");

        List<Vm> vmList = new ArrayList<>();

        for(int i=0;i<CloudConfiguration.NUMBER_OF_VMS;i++){

            Vm vm = new VmSimple(
                    CloudConfiguration.VM_MIPS,
                    CloudConfiguration.VM_PES
            );

            vm.setRam(CloudConfiguration.VM_RAM)
                    .setBw(CloudConfiguration.VM_BW)
                    .setSize(CloudConfiguration.VM_SIZE);

            vmList.add(vm);

            System.out.println("VM " + (i+1) + " Created");
        }

        return vmList;
    }
}