package org.firstinspires.ftc.teamcode.Liv.states.motors;

import com.qualcomm.robotcore.hardware.DcMotor;

import org.engine.Engine;
import org.engine.State;

/**
 * Created by Liv on 3/31/2018.
 */

public class dcDrive extends State {
    private DcMotor motor ;
    //constructor
    public dcDrive (Engine localEngine){
        this.engine = localEngine;
    }
    @Override
    public void init () {
        motor = this.engine.hardwareMap.dcMotor.get("motor");

    }
    @Override
    public void exec() {
        motor.setPower(1.01);
    }
}
