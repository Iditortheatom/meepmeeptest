package com.example.MeepMeep;
import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;

import org.rowlandhall.meepmeep.MeepMeep;
import org.rowlandhall.meepmeep.roadrunner.DefaultBotBuilder;
import org.rowlandhall.meepmeep.roadrunner.entity.RoadRunnerBotEntity;
public class MyClass {
    static final float TILE_LEN = 24f;
    static final float ROBOT_LEN = 24f;
    public static void main(String[] args) {
        MeepMeep meepMeep = new MeepMeep(800);
         RoadRunnerBotEntity myBot2 = new DefaultBotBuilder(meepMeep)
                 // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                 .setConstraints(60, 60, Math.toRadians(180), Math.toRadians(180), 15)
                 .followTrajectorySequence(drive -> drive.trajectorySequenceBuilder(new Pose2d(-TILE_LEN + 0.5 * ROBOT_LEN, 3 * TILE_LEN - 0.5 * ROBOT_LEN,  Math.toRadians(90)))
                          .strafeTo(new Vector2d(-1.5*TILE_LEN,1.5*TILE_LEN))
                         .turn(Math.toRadians(90))
                         .strafeTo(new Vector2d(-1.5*TILE_LEN,0.5*TILE_LEN))
                         .strafeTo(new Vector2d(-1.9*TILE_LEN,0.5*TILE_LEN))
                         .strafeTo(new Vector2d(-1.9*TILE_LEN,2.3*TILE_LEN))
                         .strafeTo(new Vector2d(-1.9*TILE_LEN,0.5*TILE_LEN))
                         .strafeTo(new Vector2d(-2.3*TILE_LEN,0.5*TILE_LEN))
                         .strafeTo(new Vector2d(-2.3*TILE_LEN,2.3*TILE_LEN))
                         .strafeTo(new Vector2d(-2.3*TILE_LEN,0.5*TILE_LEN))
                         .strafeTo(new Vector2d(-2.5*TILE_LEN,0.5*TILE_LEN))
                         .strafeTo(new Vector2d(-2.5*TILE_LEN,2.3*TILE_LEN))
                         .lineToLinearHeading(new Pose2d(TILE_LEN*-2,TILE_LEN*2.4,Math.toRadians(90)) )
                         .waitSeconds(1)
                         .back(7)
                         .waitSeconds(1)
                         .lineToLinearHeading(new Pose2d(TILE_LEN*0,TILE_LEN*1.4,Math.toRadians(-90)) )
                         .waitSeconds(1)                         .lineToLinearHeading(new Pose2d(TILE_LEN*-2,TILE_LEN*2.4,Math.toRadians(90)) )
                         .waitSeconds(1)
                         .back(7)
                         .waitSeconds(1)
                         .lineToLinearHeading(new Pose2d(TILE_LEN*0,TILE_LEN*1.4,Math.toRadians(-90)) )
                         .waitSeconds(1)
                         .lineToLinearHeading(new Pose2d(TILE_LEN*-2,TILE_LEN*2.4,Math.toRadians(90)) )
                         .waitSeconds(1)
                         .back(7)
                         .waitSeconds(1)
                         .lineToLinearHeading(new Pose2d(TILE_LEN*0,TILE_LEN*1.4,Math.toRadians(-90)) )
                         .waitSeconds(1)


                         .build());

        RoadRunnerBotEntity myBot = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(60, 60, Math.toRadians(180), Math.toRadians(180), 15)
                .followTrajectorySequence(drive -> drive.trajectorySequenceBuilder(new Pose2d(-TILE_LEN + 0.5 * ROBOT_LEN, 3 * TILE_LEN - 0.5 * ROBOT_LEN, Math.toRadians(270)))
                        .splineToLinearHeading(new Pose2d(TILE_LEN*2.4,TILE_LEN*2.4,Math.toRadians(-45-90)),Math.toRadians(0))
                        .waitSeconds(1)
                        .lineToLinearHeading(new Pose2d(2*TILE_LEN,1.6*TILE_LEN,Math.toRadians(-90)))
                        .lineToLinearHeading(new Pose2d(TILE_LEN*2.4,TILE_LEN*2.4,Math.toRadians(-45-90)))
                        .waitSeconds(1)

                        .lineToLinearHeading(new Pose2d(2.5*TILE_LEN,1.6*TILE_LEN,Math.toRadians(-90)))
                        .lineToLinearHeading(new Pose2d(TILE_LEN*2.4,TILE_LEN*2.4,Math.toRadians(-45-90)))

                        .waitSeconds(1)
                        .lineToLinearHeading(new Pose2d(2.5*TILE_LEN,1.6*TILE_LEN,Math.toRadians(-45)))
                        .lineToLinearHeading(new Pose2d(TILE_LEN*2.4,TILE_LEN*2.4,Math.toRadians(-45-90)))
                        .waitSeconds(1)

                        .build());

                        // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width

        meepMeep.setBackground(MeepMeep.Background.FIELD_INTOTHEDEEP_JUICE_DARK)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
                .addEntity(myBot)
                .addEntity(myBot2)
                .start();
    }

}