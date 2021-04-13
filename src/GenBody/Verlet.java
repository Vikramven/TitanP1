package GenBody;

import interfaces.Vector3dInterface;

public class Verlet {
    static double verlet(double currentPos, double acceleration, double changeT) {

        // Note that we are using a temp variable for the previous position
        double prev_pos, temp_pos, time;
        prev_pos =currentPos;
        time = 0;

        while (currentPos > 0) {
            time += changeT;
            temp_pos = currentPos;
            currentPos = currentPos*2 - prev_pos + acceleration * changeT * changeT;
            prev_pos = temp_pos;
        }

        return time;
    }

    static BasicVerlet calculations(double pos, double acc, double dt) {

        // Note that we are using a temp variable for the previous position
        double prev_pos, temp_pos, time, vel;
        prev_pos = pos;
        vel = 0;
        time = 0;
        while (pos > 0) {
            time += dt;
            temp_pos = pos;
            pos = pos*2 - prev_pos + acc * dt * dt;
            prev_pos = temp_pos;

            // The acceleration is constant, so the velocity is straightforward
            vel += acc*dt;
        }

        return new BasicVerlet(time, vel);
    }

    static BasicVerlet velocity_verlet(double pos, double acc, double dt) {

        // Note that we are using a temp variable for the previous position
        double time, vel;
        vel = 0;
        time = 0;
        while (pos > 0) {
            time += dt;
            pos += vel*dt + 0.5*acc * dt * dt;
            vel += acc*dt;
        }
        return new BasicVerlet(time, vel);
    }

    public static void main(String[] args) {

        double verletTime = verlet(5.0, -10, 0.01);
        System.out.println("Time for Verlet integration is: " + verletTime);

        BasicVerlet stormerVerlet = calculations(5.0, -10, 0.01);
        System.out.println("Time for Stormer Verlet integration is: " + stormerVerlet.time);
        System.out.println("Velocity for Stormer Verlet integration is: " + stormerVerlet.vel);

        BasicVerlet velocityVerlet = velocity_verlet(5.0, -10, 0.01);
        System.out.println("Time for velocity Verlet integration is: " + velocityVerlet.time);
        System.out.println("Velocity for velocity Verlet integration is: " + velocityVerlet.vel);
    }
}

