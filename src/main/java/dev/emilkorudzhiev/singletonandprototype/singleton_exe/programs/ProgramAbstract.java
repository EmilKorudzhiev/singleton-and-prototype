package dev.emilkorudzhiev.singletonandprototype.singleton_exe.programs;

import dev.emilkorudzhiev.singletonandprototype.singleton_exe.Logger;

public abstract class ProgramAbstract {

    public final Logger logger;

    public ProgramAbstract() {
        logger = Logger.getInstance();
    }

    abstract void log(String message);

}
