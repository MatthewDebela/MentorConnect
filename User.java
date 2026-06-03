package mentorconnect;

public abstract class User { 
	
   private String name; 
   private String field; 
   private String community; 
   
   public User(String name, String field, String community) { 
       this.name = name; 
       this.field = field; 
       this.community = community; 
   } 
   public String getName() { 
       return name; 
   } 
   public String getField() { 
       return field; 
   } 
   public String getCommunity() { 
       return community; 
   } 
   public void setName(String name) { 
       this.name = name; 
   } 
   public void setField(String field) { 
       this.field = field; 
   } 
   public void setCommunity(String community) { 
       this.community = community; 
   } 
   public abstract void displayProfile(); 
 } 
