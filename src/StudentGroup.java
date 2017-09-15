

import java.util.Date;
public class StudentGroup implements StudentArrayOperation {
        private Student[] students;
        public StudentGroup(int length) {
		this.students = new Student[length];
	}
	
	void display()
	{
	System.out.println(id);
	System.out.println(fullName);
	System.out.println(birthDate);
	System.out.println(avgMark);
	}
	@Override
	public Student[] getStudents() {
        int i;
        for(i=0;i<5;i++)
	{
	a[i].display();
	}
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudents(Student[] students) throws IllegalArgumentException {
        Student a=new Student(24, V LAHARI,1996-12-21,92.3);
  	Student a=new Student(13, M MADHU,1996-10-13,95.3);
 	Student a=new Student(06, V GEETHIKA,1996-02-06,95.3);
  	Student a=new Student(06, P SREEKUMARI,1996-10-14,94.3);
  	Student a=new Student(21, M CHINTU,2012-10-15,93.3);	
	// Add your implementation here
	}

	@Override
	public Student getStudent(int index)  {
	try{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter index");
	int index=sc.nextInt();
	if(index==0||index>=a[i].length)throws IllegalArgumentException
	}
	catch(IllegalArgumentException ie)
	{
	ie.printStackTrace();
	}
         // Add your implementation here
		return null;
	}
	@Override
	public void setStudent(Student student, int index) {
	try
	{
	Scanner sc=new Scanner(System.in);
	int index;
	System.out.println("enter index which is to be replaced");
	int index=sc.nextInt();
	a[index]=student;
	if( student=null||index=0||index>=a[i].length)throws IllegalArgumentException
	}
	catch(IllegalArgumentException ie)
	{
	ie.printStackTrace();
	}
	@Override
	
		// Add your implementation here
	}
	public void add(Student student, int index) {
	student[] list=new object[5];
	list[0[=object1;
        list[2]=object3;
	list[1]=object2;
	
		// Add your implementation here
	}
	

	@Override
	public void addFirst(Student student) {
	Student a[]=new Student[5];
	a[0]=student;
	}
		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
	a[length-1]=student;
	}
		// Add your implementation here
	}


	@Override
	public void remove(int index) {
	for(i=index;i<a.length;i++)
	a[i]=a[i+1];
	}
	a.length=a.length-1;
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
	System.out.println("enter the index from which we have to delete");
	for(i=0;i<a.length;i++)
	{
	if(a[i]=a[index])
	a.remove(a[i++]);
	}
	else
	{
	System.out.println("index not found"):
	}
	}
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
	int element;
	System.out.println("enter the element from which we have to delete");
	for(i=0;i<a.length;i++)
	{
	if(a[i]=a[element])
	a.remove(a[i++]);
	}
	else
	{
	System.out.println("element not found"):
	}
	}
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
	int index;
	System.out.println("enter the index upto which we have to delete");
	for(i=0;i<a.length;i++)
	{
	if(a[i]=a[index])
	a.remove(a[i--]);
	}
	else
	{
	System.out.println("index not found"):
	}
	}
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
	int element;
	System.out.println("enter the index upto which we have to delete");
	for(i=0;i<a.length;i++)
	{
	if(a[i]=a[element])
	a.remove(a[i--]);
	}
	else
	{
	System.out.println("element not found"):
	}
	}	
	// Add your implementation here
	}

	@Override
	public void bubbleSort(a[]) {
	int n=a.length;
	int temp=0;
	for(int i=0;i<n;i++)
	{
	for(int j=0;j<(n-i-1);j++){
	if(arr[j-1]>arr[j]){
	temp=arr[j-1];
	arr[j-1]=arr[j];
	arr[j]=temp;
	}
	}
	}
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
	System.out.println("enter birthdate");
	for(i=0;i<5;i++)
	{
	if(a[i]==date)
	System.out.println(a[i].name)
	else
	{
	System.out.println("not found");
	}
	}	
	
	
	
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
	for(i=firstDate;i<lastDate;i++)
	{
	System.out.println(a[i].name);
	}
	
	
	
	
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
	if(date==nearBirthDate)
	{
	System.out.println(a[i].name);
	}

		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
	int x=2017-a[index].Date];
	System.out.println(x);
	
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {	
	for(i=0;i<a.length;i++)
	{
	if(a[i].age==age)
	{
	System.out.println(a[i].name)
	}
	}
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
	a[0]=max;
	for(i=1;i<=a.length;i++)
	{
	if(a[i]>a[max])
	{
	a[i]=max;
	}
	}
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
	int index;
        for(i=0;i<a.length;i++)
	{
	if(a[i]==student)
        System.out.println(a[i++]);
	}	
		// Add your implementation here
		return null;
	}
}
