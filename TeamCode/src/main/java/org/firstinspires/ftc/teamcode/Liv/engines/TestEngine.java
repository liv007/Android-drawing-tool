package org.firstinspires.ftc.teamcode.Liv.engines;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.engine.Engine;
import org.firstinspires.ftc.teamcode.Liv.subEngines.SubEngineA;

/**
 * Created by Liv on 3/31/2018.
 */
@Autonomous(name="TestEngine")
public class TestEngine extends Engine {
    @Override
    public void setProcesses() {
        addSubEngine(new SubEngineA(this));



    }

}
