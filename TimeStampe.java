import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class TimeStampe {
	public TimeStampe(String formate){
		String timeStamp = new SimpleDateFormat(formate).format(new Timestamp(System.currentTimeMillis()));
		System.out.println(timeStamp);
	}
}
