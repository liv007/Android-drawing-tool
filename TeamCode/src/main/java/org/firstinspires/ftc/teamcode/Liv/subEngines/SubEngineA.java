package org.firstinspires.ftc.teamcode.Liv.subEngines;

import org.engine.Engine;
import org.engine.SubEngine;
import org.firstinspires.ftc.teamcode.Liv.states.motors.MotorA;

/**
 * Created by Liv on 6/23/2018.
 */

public class SubEngineA extends SubEngine {
    Engine engine;
    public SubEngineA(Engine engine){
        this.engine = engine;
    }

    @Override
    public void setProcesses() {
        addState(new MotorA(engine, 1.0, 1000));
        addState(new MotorA(engine, -1.0, 1000));
    }

    @Override
    public void evaluate() {
        setRunable(true);


    }
}
