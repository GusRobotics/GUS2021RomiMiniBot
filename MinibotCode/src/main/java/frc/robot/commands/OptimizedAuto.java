
package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class OptimizedAuto extends SequentialCommandGroup {

    public OptimizedAuto(Drivetrain driveBase) {
        addCommands(new DriveDistance(0.5, 6.45, 0, driveBase),
                new DriveDistance(0.5, 5.165 * Math.PI / 8, -0.5, driveBase),
                new DriveDistance(0.5, 8.35, 0, driveBase), new DriveDistance(0.5, 9.0 * Math.PI / 8, -0.5, driveBase),
                new DriveDistance(0.5, 6.5, 0, driveBase), new DriveDistance(0.5, 10.0 * Math.PI / 8, -0.5, driveBase),
                new DriveDistance(0.5, 3.25, 0, driveBase),
                new DriveDistance(0.5, 3.827 * Math.PI / 4, -0.5, driveBase),
                new DriveDistance(0.5, 14.25, 0, driveBase), new DriveDistance(0.5, 3.0 * Math.PI / 4, 0.5, driveBase),
                new DriveDistance(0.5, 0.95, 0, driveBase), new DriveDistance(0.5, 4.15 * Math.PI / 3, 0.5, driveBase),
                new DriveDistance(0.5, 11.90, 0, driveBase), new DriveDistance(0.5, 4.55 * Math.PI / 4, 0.5, driveBase),
                new DriveDistance(0.5, 11.65, 0, driveBase));
        // new DriveDistance(0.5, 10.5, driveBase), new TurnDegrees(0.5, 90, driveBase),
        // new DriveDistance(0.5, 9, driveBase), new TurnDegrees(0.5, 270, driveBase),
        // new DriveDistance(0.5, 10.5, driveBase), new TurnDegrees(0.5, 270,
        // driveBase),
        // new DriveDistance(0.5, 13.5, driveBase), new TurnDegrees(0.5, 270,
        // driveBase),
        // new DriveDistance(0.5, 13.5, driveBase));
    }

}