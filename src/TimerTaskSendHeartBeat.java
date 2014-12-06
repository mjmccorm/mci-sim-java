import java.util.Calendar;
import java.util.TimerTask;

class TimerTaskSendHeartBeat extends TimerTask {

	IncidentTimer healthStatusHolder = null;
	int counter = 0;

	public TimerTaskSendHeartBeat(IncidentTimer healthStatusHolder) {
		this.healthStatusHolder = healthStatusHolder;
	}

	HeartBeatMessage message = null;

	public void run() {

		// create HeartBeat message by getting Health Status (RED/GREEN/AMBER)
		// Error Code, if any AND time at which heartbeat is sent to help
		// receiver discard any delayed messages due to latency
		message = new HeartBeatMessage(
				this.healthStatusHolder.getHealthStatus(), Calendar
						.getInstance().getTimeInMillis(), -1);

		//System.out.println("Sending HeartBeat Message");

		// Send the message to Monitoring Dashboard
		//System.out.println(message);
		//System.out.println("HeartBeat Message Sent");
		System.out.println(counter);
		counter++;
	}

	/**
	 * Simple POJO which is a heartbeat message object It can have any decoder
	 * encoder mechanism to send over any messaging platform
	 */
	class HeartBeatMessage {
		private String status;
		private long heartBeatTime;
		private int errorCode;

		public HeartBeatMessage(String status, long heartBeatTime, int errorCode) {
			this.status = status;
			this.heartBeatTime = heartBeatTime;
			this.errorCode = errorCode;
		}

		public String getStatus() {
			return status;
		}

		public long getHeartBeatTime() {
			return heartBeatTime;
		}

		public int getErrorCode() {
			return errorCode;
		}

		
		public String toString() {
			return "status: " + status + " timeOfHeartBeat: "
					+ new java.util.Date(this.heartBeatTime) + " errCode : "
					+ this.errorCode;
		}
	}
}