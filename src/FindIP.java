//// Given a file with ping results from different sources (e.g. See below. To return “173.252.120.68”) 
////Return the IP address that took >70ms in 3 or more consecutive pings. 
//
//
//
//import java.util.ArrayList;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.regex.*;
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.io.Reader;
//
//public class FindIP {
//
//	public static void main(String[] args) throws IOException {
//
//		String filename = "file", repeatIP = "", lineIP = "";
//		String ipRegex_pattern = "(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
//		String read;
//		int counter = 0;
//		ArrayList<String> ip = new ArrayList<String>();
//		BufferedReader buffer;
//		buffer = new BufferedReader(new FileReader(filename));
//		while ((read = buffer.readLine()) != null) {
//			// get time out of string
//			int start_position = read.indexOf("time=");
//			int end_position = read.indexOf("ms");
//			String time = (read.substring(start_position + 5, end_position))
//					.replaceAll("//s", "");
//			// convert string time to double
//			double new_time = Double.parseDouble(time);
//			// get the time >70.000
//			if (new_time > 70.000) {
//				// get the ip from the string using regex pattern
//				//Pattern pattern = Pattern.compile(ipRegex_pattern);
//				//Matcher match = pattern.matcher(read);
//
////				if (match.find()) {
////					lineIP = match.group();
////					System.out.println(match.group() + "   ------   "
////							+ new_time);
//
//				}
//				if (repeatIP.equals(lineIP)) {
//					counter++;
//				} else {
//					repeatIP = lineIP;
//					counter = 1;
//				}
//			} else {
//				counter = 0;
//			}
//			if (counter > 2)
//				ip.add(repeatIP);
//
//		}
//
//		if (ip.size() < 1) {
//			System.out
//					.println("No IP address that took >70ms in 3 or more consecutive pings.");
//		} else {
//			System.out
//					.println("IP address that took >70ms in 3 or more consecutive pings are: ");
//			for (String ipList : ip) {
//				System.out.println("\t=>  " + ipList);
//			}
//		}
//
//	}
//
//}
