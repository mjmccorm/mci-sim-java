import java.util.TimerTask;

class TimerTaskUpdateHeartBeat extends TimerTask {

	IncidentTimer healthClass = null;

	public TimerTaskUpdateHeartBeat(IncidentTimer healthClass) {
		this.healthClass = healthClass;
	}

	public void run() {
		System.out.println("Saving history");
		healthClass.setHealthStatus("AMBER");
	}

}