import java.text.SimpleDateFormat;
import java.util.Date;
public class DateFormate{
	public static void main(String[] args){
		SimpleDateFormat formatePaten= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		
		System.out.println(formatePaten.format(date));
	}
}