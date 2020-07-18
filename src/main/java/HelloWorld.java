import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.concurrent.Executors;

import java.sql.SQLException;
import java.sql.Statement;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.sql.Connection connect = ConnectDB.getJDBCConnection();
//		try {
//			Statement statement = connect.createStatement();
//			String sql = "SELECT * FROM list_app Limit 0,10";
////			System.out.println(sql);
//			ResultSet rs = statement.executeQuery(sql);
//			while (rs.next()) {
//				String appid = rs.getString("appid");
//				System.out.println(appid);
//			}
//			rs.close();
//			if (statement != null) {
//				connect.close();
//			}
//			System.exit(0);
			String url = "https://play.google.com/store/apps/details?id=com.facebook.katana&hl=en&gl=us";
			try {
				File input = new File("C:\\testing.html");
				Document doc = Jsoup.parse(input, "UTF-8");
//				Document doc = Jsoup.connect(url).get();
//				String html = Jsoup.connect(url).get().html();
				String title = doc.title();
				String description = doc.select("div[jsname=sngebd]").first().text();
				Elements href = doc.select("a[href]");

//				FileWriter myWriter;
//				myWriter = new FileWriter("C:\\Users\\Thanh Binh\\Desktop/testing.html");
//				myWriter.write(html);
//				myWriter.close();
				System.out.println(doc);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
//		} catch (SQLException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}

//		System.out.println("HelloWorld");
	}

}
