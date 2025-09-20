package inkgcding;



public class newperson {
  private String name;
  private int rollnumber;
  private String id;

 
  public newperson(String id,String name,int rollnumber){
    this.id=id;
    this.name=name;
    this.rollnumber=rollnumber;
  
  }


  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + rollnumber;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }


  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    newperson other = (newperson) obj;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (rollnumber != other.rollnumber)
      return false;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }


  @Override
  public String toString() {
    return "persons [name=" + name + ", rollnumber=" + rollnumber + ", id=" + id + "]";
  }


  public String getName() {
    return name;
  }


  public int getRollnumber() {
    return rollnumber;
  }


  public String getId() {
    return id;
  }


  public void setName(String name) {
    this.name = name;
  }


  public void setRollnumber(int rollnumber) {
    this.rollnumber = rollnumber;
  }


  public void setId(String id) {
    this.id = id;
  }

  


}
