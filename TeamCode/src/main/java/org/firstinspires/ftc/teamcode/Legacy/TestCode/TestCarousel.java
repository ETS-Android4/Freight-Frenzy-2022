package org.firstinspires.ftc.teamcode.TestCode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.Control.AutonomousControl;
import org.firstinspires.ftc.teamcode.Control.Goal;

@Autonomous(name="TestCarousel", group="basic")
public class TestCarousel extends AutonomousControl
{
    @Override
    public void runOpMode() throws InterruptedException
    {
        setup(runtime, Goal.setupType.carousel);

        rob.runSingleMotorSpeed(-0.1, rob.carousel, DcMotor.RunMode.RUN_USING_ENCODER);

        sleep(5000);
    }
}