package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.utils.Robot;

@Autonomous(name="Drive", group="OpMode")
public class DriveOpMode extends LinearOpMode {
    @Override
    public void runOpMode() {
        Robot r = new Robot(this);
        r.runDriveMode();
    }
}
