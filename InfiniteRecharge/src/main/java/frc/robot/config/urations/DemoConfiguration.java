
package frc.robot.config.urations;

import frc.robot.config.Config;
import frc.robot.config.MotorConfig.EncoderType;
import frc.robot.utils.control.pidf.PIDF;

public class DemoConfiguration extends Config {
    // Drive
    public int LEFT_DRIVE_IDS[] = new int[] {1, 4};
        
        
    public int RIGHT_DRIVE_IDS[] = new int[] {2, 3};

    // Shooter
    public int AZIMUTH_MOTOR_ID = 5;
    public int SHOOTER_MOTOR_ID = 6;
    public int FEEDER_MOTOR_ID = 7;
    
    // Intake
    public int INTAKE_MOTOR_ID = 8;

    
    public DemoConfiguration() {
        super();

        // junior doesn't have these, but move the motor ids around so they
        // don't conflict with junior's drive motors
        shooter.azimuth.id = AZIMUTH_MOTOR_ID;
        shooter.feeder.id = FEEDER_MOTOR_ID;
        shooter.shooter.id = SHOOTER_MOTOR_ID;

        drive = new DriveConfig(EncoderType.Integrated); // Falcons!
        // setup junior's drive motors and pid constants.
        drive.MOTORS_PER_SIDE = 2;
        drive.leftIDs = LEFT_DRIVE_IDS;
        drive.rightIDs = RIGHT_DRIVE_IDS;

        drive.initMotorConfigArrays();
    }
}