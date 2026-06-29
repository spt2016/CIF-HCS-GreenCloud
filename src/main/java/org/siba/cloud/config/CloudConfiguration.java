package org.siba.cloud.config;

/**
 * Global configuration for the CIF-HCS Cloud Simulator.
 * All infrastructure parameters are defined here so that
 * experiments can be reproduced easily.
 */
public class CloudConfiguration {

    // -----------------------------
    // Datacenter Configuration
    // -----------------------------
    public static final int NUMBER_OF_HOSTS = 2;

    // -----------------------------
    // Host Configuration
    // -----------------------------
    public static final int HOST_RAM = 16384;          // MB
    public static final long HOST_BW = 100000;         // Mbps
    public static final long HOST_STORAGE = 1000000;   // MB
    public static final int HOST_PES = 8;
    public static final int HOST_MIPS = 1000;

    // -----------------------------
    // VM Configuration
    // -----------------------------
    public static final int NUMBER_OF_VMS = 4;
    public static final int VM_RAM = 2048;
    public static final long VM_BW = 1000;
    public static final long VM_SIZE = 10000;
    public static final int VM_PES = 2;
    public static final int VM_MIPS = 1000;

    // -----------------------------
    // Cloudlet Configuration
    // -----------------------------
    public static final int NUMBER_OF_CLOUDLETS = 20;
    public static final int CLOUDLET_LENGTH = 10000;
    public static final int CLOUDLET_PES = 2;

}