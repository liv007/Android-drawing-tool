package org.firstinspires.ftc.teamcode.Liv.states.motors;

import com.qualcomm.robotcore.hardware.Servo;

import org.engine.Engine;
import org.engine.State;

/**
 * Created by Liv on 4/7/2018.
 */

public class ServoState extends State {
    private Servo servo;
    private double position;
    public ServoState(Engine engine) {
        this.engine = engine;
    }
    public ServoState (Engine engine, double position) {
        this.engine = engine;
        this.position = position;
        sleep(500);
    }
    @Override
    public void init (){
        servo = engine.hardwareMap.servo.get("servo");
    }
    @Override
    public void exec() {
        servo.setPosition(position);
        setFinished(true);
    }
}
