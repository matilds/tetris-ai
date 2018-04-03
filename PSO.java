public class PSO {
    /**
     * (Copied from Wikipedia to aid me in understanding PSO. Let's go PJ.)
     * for each particle i = 1, ..., S do
     *    Initialize the particle's position with a uniformly distributed random vector: xi ~ U(blo, bup)
     *    Initialize the particle's best known position to its initial position: pi ← xi
     *    if f(pi) < f(g) then
     *        update the swarm's best known  position: g ← pi
     *    Initialize the particle's velocity: vi ~ U(-|bup-blo|, |bup-blo|)
     * while a termination criterion is not met do:
     *    for each particle i = 1, ..., S do
     *       for each dimension d = 1, ..., n do
     *          Pick random numbers: rp, rg ~ U(0,1)
     *          Update the particle's velocity: vi,d ← ω vi,d + φp rp (pi,d-xi,d) + φg rg (gd-xi,d)
     *       Update the particle's position: xi ← xi + vi
     *       if f(xi) < f(pi) then
     *          Update the particle's best known position: pi ← xi
     *          if f(pi) < f(g) then
     *             Update the swarm's best known position: g ← pi
     */

    // for these values, we start with a small number then play with it to find the idea
    public static final int POP = 16;
    public static final int NUMGAMES = 50;
    public static final int NUMITERATIONS = 100;

    // Parameters (to be fine tuned later)
    public static double OMEGA = 0.001;
    public static double PHI_PARTICLE = 0.001;
    public static double PHI_GLOBAL = 0.001;

    // ok we need particle array for the first for loop
    public Particle[] particles;
    public double[] bestGlobalPosition = new double[2];
}
