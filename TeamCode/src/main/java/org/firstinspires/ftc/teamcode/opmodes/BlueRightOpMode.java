package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.utils.Robot;

@Autonomous(name="Auto Blue Right", group="Auto")
public class BlueRightOpMode extends LinearOpMode {
    @Override
    public void runOpMode() {
        Robot r = new Robot(this, Robot.BLUE, Robot.RIGHT);
        r.runAutonomous();
    }
}
