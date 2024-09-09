package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.utils.Robot;

@Autonomous(name="Auto Red Right", group="Auto")
public class RedRightOpMode extends LinearOpMode {
    @Override
    public void runOpMode() {
        Robot r = new Robot(this, Robot.RED, Robot.RIGHT);
        r.runAutonomous();
    }
}
