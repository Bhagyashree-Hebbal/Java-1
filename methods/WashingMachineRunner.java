//1st task 

class WashingMachineRunner
{
    
	public static void main(String[] args)
    {
	    System.out.println("running main in WashingMachineRunner");
		WashingMachine.wash();//call:invoking
		WashingMachine.makesNoise();
		WashingMachine.shake();
		WashingMachine.displayTime();
		WashingMachine.dry();
		WashingMachine.clean();
		WashingMachine.soak();
		WashingMachine.timeConsuming();
		WashingMachine.start();
		WashingMachine.pause();
	}
}