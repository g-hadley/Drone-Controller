package com.example.dronecontroller;

public class ControlValue {
    static int throttle = 1000;
    static int roll = 1500;
    static int pitch = 1500;
    static int yaw = 1500;
    final int MAX_VALUE = 2000;
    final int MIN_VALUE = 1000;

    public static int getThrottle() {
        return throttle;
    }

    public static void setThrottle(int throttle) {
        ControlValue.throttle = throttle;
    }

    public static int getRoll() {
        return roll;
    }

    public static void setRoll(int roll) {
        ControlValue.roll = roll;
    }

    public static int getPitch() {
        return pitch;
    }

    public static void setPitch(int pitch) {
        ControlValue.pitch = pitch;
    }

    public static int getYaw() {
        return yaw;
    }

    public static void setYaw(int yaw) {
        ControlValue.yaw = yaw;
    }

    public void throttleUp(int num){
        if(throttle + num > MAX_VALUE) {
            throttle = MAX_VALUE;
        }
        else {
            throttle += num;
        }
    }

    public void throttleDown(int num){
        if(throttle - num < MIN_VALUE) {
            throttle = MIN_VALUE;
        }
        else {
            throttle -= num;
        }
    }

    public void pitchUp(int num){
        if(pitch + num > MAX_VALUE) {
            pitch = MAX_VALUE;
        }
        else {
            pitch += num;
        }
    }

    public void pitchDown(int num){
        if(pitch - num < MIN_VALUE) {
            pitch = MIN_VALUE;
        }
        else {
            pitch -= num;
        }
    }

    public void yawLeft(int num){
        if(yaw + num > MAX_VALUE) {
            yaw = MAX_VALUE;
        }
        else {
            yaw += num;
        }
    }

    public void yawRight(int num){
        if(yaw - num < MIN_VALUE) {
            yaw = MIN_VALUE;
        }
        else {
            yaw -= num;
        }
    }

    public void rollLeft(int num){
        if(roll + num > MAX_VALUE) {
            roll = MAX_VALUE;
        }
        else {
            roll += num;
        }
    }

    public void rollRight(int num){
        if(roll - num < MIN_VALUE) {
            roll = MIN_VALUE;
        }
        else {
            roll -= num;
        }
    }
}
