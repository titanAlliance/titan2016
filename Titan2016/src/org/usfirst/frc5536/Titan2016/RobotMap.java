// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5536.Titan2016;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Ultrasonic;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.ADXL362;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.interfaces.Accelerometer;


/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTrainleftFrontMotor;
    public static SpeedController driveTrainleftRearMotor;
    public static SpeedController driveTrainrightFrontMotor;
    public static SpeedController driveTrainrightRearMotor;
    public static RobotDrive driveTrainRobotDrive;
    public static Ultrasonic driveTrainultraSonic1;
    public static SpeedController intakeintake1;
    public static SpeedController strongArmSpeedController1;
    public static SpeedController strongArmSpeedController2;
    public static Encoder strongArmQuadratureEncoder1;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    public static ADXRS450_Gyro driveTrainGyro;
    public static Accelerometer driveTrainAccel;

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainleftFrontMotor = new Spark(0);
        LiveWindow.addActuator("driveTrain", "leftFrontMotor", (Spark) driveTrainleftFrontMotor);
        
        driveTrainleftRearMotor = new Spark(3);
        LiveWindow.addActuator("driveTrain", "leftRearMotor", (Spark) driveTrainleftRearMotor);
        
        driveTrainrightFrontMotor = new Spark(2);
        LiveWindow.addActuator("driveTrain", "rightFrontMotor", (Spark) driveTrainrightFrontMotor);
        
        driveTrainrightRearMotor = new Spark(1);
        LiveWindow.addActuator("driveTrain", "rightRearMotor", (Spark) driveTrainrightRearMotor);
        
        driveTrainRobotDrive = new RobotDrive(driveTrainleftFrontMotor, driveTrainrightRearMotor,
              driveTrainrightFrontMotor, driveTrainleftRearMotor);
        
        driveTrainRobotDrive.setSafetyEnabled(true);
        driveTrainRobotDrive.setExpiration(0.1);
        driveTrainRobotDrive.setSensitivity(0.5);
        driveTrainRobotDrive.setMaxOutput(1.0);
        driveTrainRobotDrive.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
        driveTrainRobotDrive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
        driveTrainRobotDrive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
        driveTrainRobotDrive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
        driveTrainultraSonic1 = new Ultrasonic(2, 3);
        LiveWindow.addSensor("driveTrain", "ultraSonic1", driveTrainultraSonic1);
        
        intakeintake1 = new Talon(4);
        LiveWindow.addActuator("intake", "intake1", (Talon) intakeintake1);
        
        strongArmSpeedController1 = new Talon(6);
        LiveWindow.addActuator("strongArm", "Speed Controller 1", (Talon) strongArmSpeedController1);
        
        strongArmSpeedController2 = new Talon(5);
        LiveWindow.addActuator("strongArm", "Speed Controller 2", (Talon) strongArmSpeedController2);
        
        strongArmQuadratureEncoder1 = new Encoder(4, 5, false, EncodingType.k4X);
        LiveWindow.addSensor("strongArm", "Quadrature Encoder 1", strongArmQuadratureEncoder1);
        strongArmQuadratureEncoder1.setDistancePerPulse(1.0);
        strongArmQuadratureEncoder1.setPIDSourceType(PIDSourceType.kRate);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        
        driveTrainGyro = new ADXRS450_Gyro();
        driveTrainGyro.reset();
        driveTrainAccel = new ADXL362(Accelerometer.Range.k4G);
        
    }
}
