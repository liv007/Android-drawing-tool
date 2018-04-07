package org.firstinspires.ftc.teamcode.Liv.states.motors;

import com.qualcomm.robotcore.hardware.DcMotor;

import org.engine.Engine;
import org.engine.State;

/**
 * Created by Liv on 3/31/2018.
 */

public class dcDrive extends State {
    private DcMotor motor ;
    private double position;
    public dcDrive (Engine localEngine){
        this.engine = localEngine;
    }
    public dcDrive (Engine engine, double position) {
        this.engine = engine;
        this.position = position;
        sleep(500);

    public void init (){
        motor = this.engine.hardwareMap.dcMotor.get("motor");
    }

    public void exec() {
        motor.setPower(position);
            setFinished(true);
    }
}
