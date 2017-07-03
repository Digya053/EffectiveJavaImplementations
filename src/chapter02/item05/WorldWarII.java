package chapter02.item05;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class WorldWarII {

	private static Date date;

	private WorldWarII(){}

	private WorldWarII(Date date){
		this.date = date;
	}

	public static WorldWarII createWorldWarInstance(Date date){
		return new WorldWarII(date);
	}

	public static Date WORLDWARII_START = null;
	public static Date WORLDWARII_END = null;

	static {
		Calendar gmtDate = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		gmtDate.set(1939, Calendar.JANUARY, 1, 0, 0,0);
		WORLDWARII_START = gmtDate.getTime();
		gmtDate.set(1945, Calendar.DECEMBER, 1, 0, 0, 0);
		WORLDWARII_END = gmtDate.getTime();
	}

	public boolean isInWorldWar(Date date){
		return date.compareTo(WORLDWARII_START) >= 0 && 
				date.compareTo(WORLDWARII_END) < 0;
	}

	public static void main(String[] args){
		WorldWarII worldWar = WorldWarII.createWorldWarInstance(new Date(1940));
		System.out.println(worldWar.isInWorldWar(date));
	}
}
