import java.util.Timer;
import java.util.TimerTask;

/**
 * This should run the incident
 * @author mjmccorm
 *
 */
public class IncidentTimer {
	private String healthStatus = "GREEN";

	//public static void main(String[] args) {
	public IncidentTimer(){

		this.setHealthStatus("GREEN");

		// Create the Timer object
		Timer timer = new Timer("Incident Timer");

		// Create Timer task created to send heartBeats
		TimerTask taskToExecute = new TimerTaskSendHeartBeat(this);
		// schedule the task to start executing after 1 second
		// and re-execute every 1 seconds
		timer.scheduleAtFixedRate(taskToExecute, 1000, 1000);

		
		// Create Timer task to setHeartBeatStatus
		TimerTask setHeartBeatStatus = new TimerTaskUpdateHeartBeat(this);
		// schedule the task to start immediately but execute
		// first time after 30 seconds
		timer.scheduleAtFixedRate(setHeartBeatStatus, 1000, 10000);

		// Wait for 60 seconds and then cancel the timer cleanly
		try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
		}
		System.out.println("Cancelling Timer Cleanly after 60 seconds");
		timer.cancel();
	}

	/**
	 * Get Heartbeat Status of the application, could be GREEN / AMBER / RED
	 * based on any exceptions or service health
	 * 
	 * @return String
	 */
	public String getHealthStatus() {
		return this.healthStatus;
	}

	/**
	 * Set the status for the application could be GREEN / AMBER / RED
	 * 
	 * @param healthStatus
	 */
	public void setHealthStatus(String healthStatus) {
		this.healthStatus = healthStatus;
	}
}