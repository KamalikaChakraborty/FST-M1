package activities;

public class Activity6 {
    public static void main(String args[]) {
        Plane plane = new Plane(10);
        plane.onboard("John");
        plane.onboard("Rahul");
        plane.onboard("Michael");
        plane.onboard("Jill");
        plane.onboard("Laura");
        plane.onboard("Anita");
        plane.onboard("Diego");
        plane.onboard("Ronnie");
        plane.onboard("Caitlin");
        System.out.println("Plane takeoff time: "+plane.takeOff());
        System.out.println("List of Passengers: "+plane.getPassesngers());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        plane.land();
        System.out.println("Plane landing time: "+plane.getLastTimeLanded());
        System.out.println("Passenger list after plane landing: "+plane.getPassesngers());
    }
}
