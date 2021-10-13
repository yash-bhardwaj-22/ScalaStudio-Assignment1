package OOPs

sealed trait Employee {
  val empid: String
  def firstName: String
  def lastName: String
  def salary: Int
  def attendance(empid: String): String
  def attendance(empid:String, st: String, et: String): String
}
case class Consultant(id:String, fn: String, ln:String, sl:Int) extends Employee{
  private val prefix = "CONS"
  override val empid: String = prefix + id
  override def firstName: String = fn
  override def lastName: String = ln
  override def salary: Int = sl
  var fullName = firstName +" "+ lastName
  override def attendance(e:String) = ("\nAttendance granted to "+fullName+" \nEmployee-ID "+empid+" \nClock-In Time- 09:45 AM"+"\nClock-Out Time- 06:45 PM"+"\nSalary "+salary)
  override def attendance(emid: String, st: String, et: String): String = ("\nAttendance granted to "+fullName+" \nEmployee-ID "+empid + " \nClock-In time:  " + st + " \nClock-Out Time " + et+"\nSalary "+salary)
}
case class Manager(id:String, fn: String, ln:String, sl:Int) extends Employee{
  private val prefix = "MANA"
  override val empid: String = prefix + id
  override def firstName: String = fn
  override def lastName: String = ln
  override def salary: Int = sl
  var fullName = firstName +" "+ lastName
  override def attendance(e:String) = ("\nAttendance granted to "+fullName+" \nEmployee-ID "+empid+" \nClock-In Time- 09:45 AM"+"\nClock-Out Time- 06:45 PM"+"\nSalary "+salary)
  override def attendance(emid: String, st: String, et: String): String = ("\nAttendance granted to "+fullName+" \nEmployee-ID "+empid + " \nClock-In time:  " + st + " \nClock-Out Time " + et+"\nSalary "+salary)
}
case class SrManager(id:String, fn: String, ln:String, sl:Int) extends Employee{
  private val prefix = "SRMA"
  override val empid: String = prefix + id
  override def firstName: String = fn
  override def lastName: String = ln
  override def salary: Int = sl
  var fullName = firstName +" "+ lastName
  override def attendance(e:String) = ("\nAttendance granted to "+fullName+" \nEmployee-ID "+empid+" \nClock-In Time- 09:45 AM"+"\nClock-Out Time- 06:45 PM"+"\nSalary "+salary)
  override def attendance(emid: String, st: String, et: String): String = ("\nAttendance granted to "+fullName+" \nEmployee-ID "+empid + " \nClock-In time:  " + st + " \nClock-Out Time " + et+"\nSalary "+salary)
}
case class President(id:String, fn: String, ln:String, sl:Int) extends Employee{
  private val prefix = "POTC"
  override val empid: String = prefix + id
  override def firstName: String = fn
  override def lastName: String = ln
  override def salary: Int = sl
  var fullName = firstName +" "+ lastName
  override def attendance(e:String) = ("\nAttendance granted to "+fullName+" \nEmployee-ID "+empid+" \nClock-In Time- 09:45 AM"+"\nClock-Out Time- 06:45 PM"+"\nSalary "+salary)
  override def attendance(emid: String, st: String, et: String): String = ("\nAttendance granted to "+fullName+" \nEmployee-ID "+empid + " \nClock-In time:  " + st + " \nClock-Out Time " + et+"\nSalary "+salary)
}