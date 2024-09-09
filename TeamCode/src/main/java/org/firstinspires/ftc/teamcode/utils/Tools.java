package org.firstinspires.ftc.teamcode.utils;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

/** Write all functions that are needed in multiple classes but don't need their own class here.
 *
 * @author github.com/jakeslye
 */
public class Tools {
    /** Runs a function for a certain amount of time. Useful for stalling the program or run by time movement.
     *
     * @param time Time to run for.
     * @param r Callback to run. Please use lambda.
     */
    public static void doForTime(double time, Runnable r){
        LinearOpMode opMode = Robot.getOpmode();

        double initTime = opMode.getRuntime();
        while(initTime+time > opMode.getRuntime() && !opMode.isStopRequested()){
            r.run();
        }
    }
}
