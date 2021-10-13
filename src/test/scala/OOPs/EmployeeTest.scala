package OOPs
import org.scalatest.flatspec.AnyFlatSpec
import scala.language.postfixOps

class EmployeeTest extends AnyFlatSpec {

  //Consultant Class
  //Case 1
  "Consultant" should "give" in{
    val empTest = new Consultant("0071","Yash","Bhardwaj", 15000)
    val empTest2 = new Consultant("0002","Mike","Tyson",12000)
    val t1 = empTest.attendance("0071")
    val t2 = empTest2.attendance("0002","09:50 AM","06:50 PM")
    assert(empTest.empid=="CONS0071")
    assert(empTest.fullName=="Yash Bhardwaj")
    assert(empTest.salary==15000)
    assert(empTest.attendance("0071")==t1)
    println(empTest.attendance("0071"))
    assert(empTest2.attendance("0002","09:50 AM","06:50 PM")==t2)
    println(empTest2.attendance("0002","09:50 AM","06:50 PM"))
  }
  "Manager" should "give" in{
    val empTest = new Manager("0075","Mukesh","Hume", 15000)
    val empTest2 = new Manager("0132","Suresh","Emett",12000)
    val t1 = empTest.attendance("0067")
    val t2 = empTest2.attendance("0132","09:52 AM","06:52 PM")
    assert(empTest.empid=="MANA0075")
    assert(empTest.fullName=="Mukesh Hume")
    assert(empTest.salary==15000)
    assert(empTest.attendance("0075")==t1)
    println(empTest.attendance("0075"))
    assert(empTest2.attendance("0132","09:52 AM","06:52 PM")==t2)
    println(empTest2.attendance("0132","09:52 AM","06:52 PM"))
  }
  "Sr Manager" should "give" in{
    val empTest = new SrManager("0017","Stink","Maie", 15000)
    val empTest2 = new SrManager("0102","Ghell","Saatu",12000)
    val t1 = empTest.attendance("0067")
    val t2 = empTest2.attendance("0102","09:47 AM","07:00 PM")
    assert(empTest.empid=="SRMA0017")
    assert(empTest.fullName=="Stink Maie")
    assert(empTest.salary==15000)
    assert(empTest.attendance("0017")==t1)
    println(empTest.attendance("0017"))
    assert(empTest2.attendance("0102","09:47 AM","07:00 PM")==t2)
    println(empTest2.attendance("0102","09:47 AM","07:00 PM"))
  }
  "President" should "give" in{
    val empTest = new President("0067","Sting","Machine", 15000)
    val empTest2 = new President("0102","Shdell","Stu",12000)
    val t1 = empTest.attendance("0067")
    val t2 = empTest2.attendance("0102","09:54 AM","07:05 PM")
    assert(empTest.empid=="POTC0067")
    assert(empTest.fullName=="Sting Machine")
    assert(empTest.salary==15000)
    assert(empTest.attendance("0067")==t1)
    println(empTest.attendance("0067"))
    assert(empTest2.attendance("0102","09:54 AM","07:05 PM")==t2)
    println(empTest2.attendance("0102","09:54 AM","07:05 PM"))
  }

}
