public class Main{
public static void main(String[] args) {
Student[] a=new Student[5];
 a[0]=new Student(24, "V LAHARI",1996-12-21,92.3);
 a[1]=new Student(13, "M MADHU",1996-10-13,95.3);
 a[2]=new Student(06, "V GEETHIKA",1996-02-06,95.3);
 a[3]=new Student(06, "P SREEKUMARI",1996-10-14,94.3);
 a[4]=new Student(21, "M CHINTU",2012-10-15,93.3);		
  StudentGroup s1=new StudentGroup();
  s1.StudentGroup(int length);
  s1.getStudents();
  s1.setStudents(Student[] students);
  s1.getStudent(int index);
  s1.setStudent(Student student, int index)
  s1.addFirst(Student student);
  s1.addLast(Student student);
  s1.add(Student student, int index);
  s1.remove(int index);
  s1.remove(Student student);
  s1.removeFromIndex(int index);
  s1.removeFromElement(Student student);
  s1.removeToIndex(int index);
  s1.removeToElement(Student student); 
  s1.bubbleSort();
  s1.getByBirthDate(Date date);
  }
}
