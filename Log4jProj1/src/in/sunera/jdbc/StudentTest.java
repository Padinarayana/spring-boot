package in.sunera.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class StudentTest {

	 	//create logger obj
	private static Logger logger=Logger.getLogger(StudentTest.class);
	
	static {
		
		try {
		//create layout obj
		SimpleLayout layout =new SimpleLayout();
		
		//create appender obj having layout
		ConsoleAppender appender=new ConsoleAppender(layout);
		
		//add appender obj to logger obj
		logger.addAppender(appender);
		
		//logger level to retrieve log message
		logger.setLevel(Level.DEBUG);
		logger.info("in.sunera.jdbc:StudentTest");
		}
		catch(Exception e) {
			e.printStackTrace();
			logger.fatal("in.sunera.jdbc:StudentTest::unknoun error message");
		}
	}
	
	public static void main(String[] args) {
		
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		
		
		//load driver class
	
			try {
				logger.debug("in.sunera.jdbc:StudentTest:: main start");
				Class.forName("oracle.jdbc.driver.OracleDriver");

//get connection

con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/ORCL", "system", "system");

//create statement obj
if(con!=null)
 st=con.createStatement();

//create result set
if(st!=null)
 rs=st.executeQuery("Select *From student_dtls");


if(rs!=null) {
				while(rs.next()) {
					System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"   "+rs.getString(3)+"   "+rs.getLong(4));
				}//while
}//if
} 
			
			catch (SQLException se) {
				// TODO Auto-generated catch block
				se.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

//	catch(SQLException se) {
//		se.printStackTrace();
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		finally {
			try {
				if(rs!=null)
				rs.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			try {
				if(st!=null)
				st.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			try {
				if(con!=null)
				con.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}//catch
		}//finally
			
			logger.debug("in.sunera.jdbc:StudentTest:: main end");
	}//main
}//class
