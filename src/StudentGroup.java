import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.lang.IllegalArgumentException;

public class StudentGroup implements GroupOperationService {

	private Student[] students;
	
	public StudentGroup(int length) {

	}

	//@Override
	public Student[] getStudents() {
            return  students;

	}

	//@Override
	public void setStudents(Student[] students) {
            students = students;

	}

	//@Override
	public Student getStudent(int index) {
            if((students == null)) {
            
            } else {
                return students[index];
            }
	}

	//@Override
	public void setStudent(Student student, int index) {
                students[index] = student;
	}

	//@Override
	public void addFirst(Student student) {
            students[0] = student;
	}

	//@Override
	public void addLast(Student student) {
            students[(students.length)+1] = student;
	}

	//@Override
	public void remove(int index) {
            students[index] = null;

	}

	//@Override
	public void remove(Student student) {
            for(int i=0;i<students.length;i++) {
                if(students[i] == student) {
                    students[i] = null;
                }
            }
	}

	//@Override
	public void removeFromIndex(int index) {
            for(int i=index;i<students.length;i++){
                students[i] = null;
            }

	}

	//@Override
	public void removeFromElement(Student student) {
            int c=0;
            for(int i=0;i<students.length;i++) {
                if(students[i] == student) {
                    c = 1;
                    
                } else {
                    c = 0;
                }
                if(c==1){
                    students[i] = null;
                }
            }

	}

	//@Override
	public void removeToIndex(int index) {
            for(int i=0;i<index;i++) {
                students[i] = null;
            }

	}

	//@Override
	public void removeToElement(Student student) {
            for(int i=0;students[i]!=student;i++){
                students[i] = null;
            }

	}

	//@Override
	public void bubbleSort() {

	}

	//@Override
	public Student[] getByBirthDate(Date date) {
            int a[] = new int[students.length];
            int k=0;
            for(int i=0;i<students.length;i++) {
                if(students[i].birthdate == date) {
                    a[k++] = students[i];
                    
                }
            }
            return a;
	}

	//@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
            int a[] = new int[students.length];
            int k=0;
            for(int i=0;i<students.length;i++) {
                if(students[i].birthdate > first date || students[i].birthdate < lastdate) {
                    a[k++] = students[index];
                }
            }
            return a;
	}

	//@Override
	public Student[] getNearBirthDate(Date date, int days) {
            
	}

	//@Override
	public int getCurrentAgeByDate(int indexOfStudent) {

	}

	//@Override
	public Student[] getStudentsByAge(int age) {

	}

	//@Override
	public Student[] getStudentsWithMaxAvgMark() {

	}

	//@Override
	public Student getNextStudent(Student student) {
                
	}

	//@Override
	public void add(Student student, int index) {
            
	}

	private int getStudentIndex(Student student) {
            for(int i=0;i<students.length;i++) {
                if(students[i] == student){
                    return i;
                }
            }
            return -1;
	}

	private int getDiffYears(Date first, Date last) {
            return 0;

	}

	private Calendar getCalendar(Date date) {
               
	}
}