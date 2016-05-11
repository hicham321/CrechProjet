import java.sql.*;


public class Model {
	
	private Connection con ;
	
	private Statement stmt;
	
	
	
	public void connectio ( String path ){
		
		
		
	    try {
	        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

	        this.con = DriverManager.getConnection(path, "", "");

	        this.stmt = con.createStatement();

	        // Returns a ResultSet that contains the data produced by the query;
	        // never null
	        String query= "insert query here";
	        ResultSet rs = stmt.executeQuery(query);


	        while (rs.next()) {
	            /*String fName = rs.getString("Field1");
	           String lName = rs.getString("LastName");
	            int age = rs.getInt("ID");*/
	        }

	        stmt.close();

	        con.close();
	    } catch (SQLException ex) {
	        System.err.println("SQLException: " + ex.getMessage());
	    } 
	      catch (ClassNotFoundException e) {
	    	  
		    System.err.println("classnotfoundException: " + e.getMessage());

	    	  
	    }
	}
	
	//SQL pour insirer un enfant dans la base
	public void InsirerEnfant (String Nom , String Prenom,int age, Date naissance,Date joindre, double prixconv, double prixpaye, Date datepay){
		
		try{
        String query= "INSERT INTO Enfant (Nom,Prenom ,age, Naissance,Date Joindre,Prix Conventioné,Prix Paye, Date Payment) VALUES("+ "'"+Nom +"'"+","+ "'"+Prenom +"'"+"," + "'"+ age+"'" +","+ "'"+naissance+"'"+ ","+"'"+joindre+ "'"+","+"'"+ prixconv+"'"+","+ "'"+prixpaye+"'" + "," +"'"+datepay +"'" +")" ;
        
        ResultSet r= this.stmt.executeQuery(query);
		}catch ( SQLException e) {
			System.out.println("sql exception : "+ e);
		}
        

		
		
	}
	
	//SQL pour insirer un employe dans la base 
	public void InsirerEnmploye(String nom , String prenom , boolean payment , double prix ){
		
		try{
	        String query= "INSERT INTO Employe ( Nom , Prenom , Payement , Prix ) VALUES ("+ nom + "," + prenom +","+ payment +","+ prix + ")";
	        
	        ResultSet r= this.stmt.executeQuery(query);
			}catch ( SQLException e) {
				System.out.println("sql exception : "+ e);
			}
		
		
	}

}
